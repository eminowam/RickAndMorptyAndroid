package com.example.techtask1.domain.usecase

import com.example.techtask1.domain.models.MainResponse
import com.example.techtask1.domain.repository.CharacterRepository

class GetCharacterUseCase(private val repository: CharacterRepository) {

    suspend operator fun invoke(page: Int): MainResponse =
        repository.getCharacter(page = page)
}