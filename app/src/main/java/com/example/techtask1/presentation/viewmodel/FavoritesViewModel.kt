package com.example.techtask1.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.techtask1.data.storage.StorageRepositoryImpl
import com.example.techtask1.domain.models.Details
import com.example.techtask1.domain.usecase.GetStorageUseCase
import com.example.techtask1.domain.usecase.SaveToStorageUseCase
import kotlinx.coroutines.launch

class FavoritesViewModel() : ViewModel() {

    private val repository = StorageRepositoryImpl()
    private val saveCharacterUseCase = GetStorageUseCase(repository)

    private val _character: MutableLiveData<List<Details>> = MutableLiveData()
    val character: MutableLiveData<List<Details>> get() = _character

    fun saveCharacter() = viewModelScope.launch {
        kotlin.runCatching {
            saveCharacterUseCase.invoke()
        }.onSuccess {
            _character.value
        }
    }
}