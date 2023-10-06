package com.example.techtask1.data.storage

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface Dao {
    @Query("SELECT * FROM CHARACTER_STORAGE_TABLE")
        suspend fun getCharacterList(): List<StorageModel>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun saveCharacter(characterStorage: StorageModel)

}