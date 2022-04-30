package projects.keheira.kmmapp.db

import android.content.Context
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver
import projects.keheira.kmmapp.AppDB

actual class DBDriverFactory(private val context: Context) {
    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(AppDB.Schema, context, "test.db")
    }
}