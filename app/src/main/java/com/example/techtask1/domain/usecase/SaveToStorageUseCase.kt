package com.example.techtask1.domain.usecase

import com.example.techtask1.domain.models.Details
import com.example.techtask1.domain.repository.StorageRepository

class SaveToStorageUseCase(private val repository: StorageRepository) {
    suspend operator fun invoke(character:Details) =
        repository.getSaveCharacter(character = character)
}