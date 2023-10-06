package com.example.techtask1.data.storage

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

const val CHARACTER_STORAGE_TABLE="character_storage_table"
@Entity(tableName = CHARACTER_STORAGE_TABLE)

data class StorageModel(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo val name: String,
    @ColumnInfo val status: String,
    @ColumnInfo val species: String,
    @ColumnInfo val image: String,

    )


