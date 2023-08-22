package com.example.techtask1.domain.usecase

import com.example.techtask1.domain.repository.StorageRepository

class GetStorageUseCase(private val repository: StorageRepository) {

    suspend operator fun invoke() = repository.getCharacterList()
}