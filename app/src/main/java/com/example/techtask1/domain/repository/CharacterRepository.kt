package com.example.techtask1.domain.repository

import com.example.techtask1.domain.models.Details
import com.example.techtask1.domain.models.MainResponse

interface CharacterRepository {

    suspend fun getCharacter(page: Int): MainResponse

    suspend fun getCharacterSave(ids: List<Int>): List<Details>

}