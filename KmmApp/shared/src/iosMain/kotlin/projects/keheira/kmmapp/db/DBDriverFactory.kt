package projects.keheira.kmmapp.db

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DBDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(AppDB.Schema, "test.db")
    }
}