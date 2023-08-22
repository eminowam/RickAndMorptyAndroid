package com.example.techtask1.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bumptech.glide.Glide.init
import com.example.techtask1.data.RepositoryImpl
import com.example.techtask1.data.storage.StorageRepositoryImpl
import com.example.techtask1.domain.models.Details
import com.example.techtask1.domain.models.MainResponse
import com.example.techtask1.domain.repository.StorageRepository
import com.example.techtask1.domain.usecase.GetCharacterUseCase
import com.example.techtask1.domain.usecase.GetDetailsUseCase
import com.example.techtask1.domain.usecase.SaveToStorageUseCase
import kotlinx.coroutines.launch

class HomeScreenViewModel : ViewModel() {

    private val repository = RepositoryImpl()
    private val storageRepository = StorageRepositoryImpl()

    private val getCharacterUseCase = GetCharacterUseCase(repository)
    private val saveCharacterUseCase = SaveToStorageUseCase(storageRepository)

    private var page = 1

    private val _character: MutableLiveData<MainResponse> = MutableLiveData()
    val character: LiveData<MainResponse> get() = _character

    private fun getCharacter() = viewModelScope.launch {
        _character.value = getCharacterUseCase.invoke(page = page)
    }

    fun saveCharacter(character: Details) = viewModelScope.launch {
        saveCharacterUseCase.invoke(character)
    }
    init {
        getCharacter()
    }

}