package com.example.techtask1.domain.repository

import com.example.techtask1.domain.models.Details

interface StorageRepository {

    suspend fun getCharacterList():List<Details>
    suspend fun getSaveCharacter(character:Details)
}