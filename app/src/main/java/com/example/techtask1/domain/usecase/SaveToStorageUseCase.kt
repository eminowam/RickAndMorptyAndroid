package com.example.techtask1.domain.usecase

import com.example.techtask1.data.storage.StorageRepositoryImpl
import com.example.techtask1.domain.models.Character

class SaveToStorageUseCase(private val repository: StorageRepositoryImpl) {
    suspend operator fun invoke(character:Character) =
        repository.getSaveCharacter(character = character)
}