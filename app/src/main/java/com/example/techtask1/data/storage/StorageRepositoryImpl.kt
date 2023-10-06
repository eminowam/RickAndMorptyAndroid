package com.example.techtask1.data.storage

import android.app.Application
import com.example.techtask1.data.mapper.MapFromListStorageToCharacter
import com.example.techtask1.data.mapper.MapFromStorageToCharacter
import com.example.techtask1.domain.models.Character
import com.example.techtask1.domain.repository.StorageRepository

class StorageRepositoryImpl : StorageRepository {

    private val dao = CharacterDataBase.getInstance(Application()).getCharacterDao()

    private val mapFromDetailsToStorage = MapFromStorageToCharacter()
    private val mapListFromDetailsToStorage = MapFromListStorageToCharacter()
    override suspend fun getCharacterList(): List<Character> {
        return dao.getCharacterList().map { list -> mapListFromDetailsToStorage.map(list) }
    }

    override suspend fun getSaveCharacter(character: Character) {
        dao.saveCharacter(mapFromDetailsToStorage.map(character))

    }
}