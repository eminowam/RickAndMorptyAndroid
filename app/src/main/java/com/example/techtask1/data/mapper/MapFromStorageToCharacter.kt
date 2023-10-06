package com.example.techtask1.data.mapper

import com.example.techtask1.data.storage.StorageModel

class MapFromStorageToCharacter : Mapper<com.example.techtask1.domain.models.Character, StorageModel> {
    override fun map(from: com.example.techtask1.domain.models.Character) = from.run {
        StorageModel(
            id = id,
            name = name,
            status = status,
            species = species,
            image = image
        )
    }
}