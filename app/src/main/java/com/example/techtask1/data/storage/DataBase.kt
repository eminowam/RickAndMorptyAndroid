package com.example.techtask1.data.storage

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.techtask1.domain.models.StorageModel
import com.example.techtask1.presentation.fragments.FavoritesFragment

private const val DB_NAME = "character_item.db"

@Database(entities = [StorageModel::class], version = 1, exportSchema = false)

abstract class DataBase : RoomDatabase() {

    abstract fun getCharacterDao(): Dao

    companion object {
        private var INSTANCE: DataBase? = null
        private val LOCK = Any()

        fun getInstance(application: Application): DataBase {
            INSTANCE?.let {
                return it
            }
            synchronized(LOCK) {
                INSTANCE?.let {
                    return it
                }
                val db = Room.databaseBuilder(
                    application,
                    DataBase::class.java,
                    DB_NAME
                ).build()
                INSTANCE = db
                return db
            }
        }
    }
}