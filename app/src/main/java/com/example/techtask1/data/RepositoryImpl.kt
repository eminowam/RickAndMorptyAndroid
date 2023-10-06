package com.example.techtask1.data

import com.example.techtask1.data.Retrofit.RetrofitInstance
import com.example.techtask1.domain.models.Details
import com.example.techtask1.domain.models.MainResponse
import com.example.techtask1.domain.repository.CharacterRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RepositoryImpl : CharacterRepository {

    private val api = RetrofitInstance.api
    override suspend fun getCharacter(page: Int): MainResponse =
        withContext(Dispatchers.IO) {
            api.getCharacter(page).body()!!
        }

    override suspend fun goDetailsCharacter(characterId: Int): Details =
        withContext(Dispatchers.IO) {
            api.goToDetailsCharacter(characterId).body()!!
        }
}