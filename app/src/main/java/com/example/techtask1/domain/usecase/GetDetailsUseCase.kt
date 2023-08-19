package com.example.techtask1.domain.usecase

import com.example.techtask1.domain.models.Details
import com.example.techtask1.domain.repository.CharacterRepository

class GetDetailsUseCase(private val repository: CharacterRepository) {

    suspend operator fun invoke(characterId: List<Int>): List<Details> =
        repository.getCharacterSave(ids = characterId)
}