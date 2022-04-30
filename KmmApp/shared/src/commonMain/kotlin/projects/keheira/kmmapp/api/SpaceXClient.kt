package projects.keheira.kmmapp.api

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.serialization.json.Json
import io.ktor.serialization.kotlinx.json.*
import projects.keheira.kmmapp.model.RocketLaunch

class SpaceXClient {
    companion object {
        private const val LAUNCHES_ENDPOINT = "https://api.spacexdata.com/v3/launches"
    }

    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json { ignoreUnknownKeys = true })
        }
    }

    suspend fun getAllLaunches(): List<RocketLaunch> {
        return httpClient.get(LAUNCHES_ENDPOINT).body()
    }
}