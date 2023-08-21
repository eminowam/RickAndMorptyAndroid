package com.example.techtask1.presentation.viewmodel

<<<<<<< HEAD
import androidx.lifecycle.ViewModel

class HomeScreenViewModel : ViewModel() {
    // TODO: Implement the ViewModel
=======
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bumptech.glide.Glide.init
import com.example.techtask1.data.RepositoryImpl
import com.example.techtask1.domain.models.MainResponse
import com.example.techtask1.domain.usecase.GetCharacterUseCase
import com.example.techtask1.domain.usecase.GetDetailsUseCase
import kotlinx.coroutines.launch

class HomeScreenViewModel : ViewModel() {
    private val repository = RepositoryImpl()
    private val getCharacterUseCase = GetCharacterUseCase(repository)

    private var page = 1

    private val _character: MutableLiveData<MainResponse> = MutableLiveData()
    val character: LiveData<MainResponse> get() = _character

    private fun getCharacter() = viewModelScope.launch {
        _character.value = getCharacterUseCase.invoke(page = page)

    }


    init {
        getCharacter()
    }

>>>>>>> ef715f8 (Initial commit)
}