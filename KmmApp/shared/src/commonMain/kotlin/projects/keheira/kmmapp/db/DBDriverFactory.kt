package projects.keheira.kmmapp.db

import com.squareup.sqldelight.db.SqlDriver

expect class DBDriverFactory {
    fun createDriver(): SqlDriver
}