package com.example.techtask1.domain.repository

import com.example.techtask1.domain.models.Character

interface StorageRepository {

    suspend fun getCharacterList(): List<Character>
    suspend fun getSaveCharacter(character: com.example.techtask1.domain.models.Character)
}