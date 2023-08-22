package com.example.techtask1.data.storage

import com.example.techtask1.data.Retrofit.RetrofitInstance
import com.example.techtask1.domain.models.Details
import com.example.techtask1.domain.repository.StorageRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

 class StorageRepositoryImpl : StorageRepository {

    private val api = RetrofitInstance.api


    override suspend fun getCharacterList(): List<Details> =
        withContext(Dispatchers.IO) {
            api.storageCharacter().body()!!
        }


        override suspend fun getSaveCharacter(character: Details): Unit =
            withContext(Dispatchers.IO) {
                api.saveCharacter()
            }


}