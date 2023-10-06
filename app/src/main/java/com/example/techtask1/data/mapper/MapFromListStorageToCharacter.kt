package com.example.techtask1.data.mapper

import com.example.techtask1.data.storage.StorageModel
import com.example.techtask1.domain.models.Character

class MapFromListStorageToCharacter :Mapper<StorageModel,Character>{
    override fun map(from: StorageModel)=from.run {
        Character(
            id = id,
            name = name,
            status = status,
            species = species,
            image =image
        )
}
}