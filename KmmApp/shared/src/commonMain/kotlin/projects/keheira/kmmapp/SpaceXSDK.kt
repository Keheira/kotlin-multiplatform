package projects.keheira.kmmapp

import projects.keheira.kmmapp.api.SpaceXClient
import projects.keheira.kmmapp.db.DBDriverFactory
import projects.keheira.kmmapp.db.Database
import projects.keheira.kmmapp.model.RocketLaunch

class SpaceXSDK (databaseDriverFactory: DBDriverFactory) {
    private val database = Database(databaseDriverFactory)
    private val api = SpaceXClient()

    @Throws(Exception::class)
    suspend fun getLaunches(forceReload: Boolean): List<RocketLaunch> {
        val cachedLaunches = database.getAllLaunches()
        return if (cachedLaunches.isNotEmpty() && !forceReload) {
            cachedLaunches
        } else {
            api.getAllLaunches().also {
                database.clearDatabase()
                database.createLaunches(it)
            }
        }
    }
}