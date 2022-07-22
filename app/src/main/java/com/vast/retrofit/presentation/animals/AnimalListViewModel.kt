package com.vast.retrofit.presentation.animals

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.vast.retrofit.domain.animals.Animal
import com.vast.retrofit.domain.animals.GetAnimalListUseCase
import com.vast.retrofit.presentation.BaseViewModel
import rx.Single

class AnimalListViewModel(val getAnimalListUseCase: GetAnimalListUseCase) : BaseViewModel() {
    private val _animalListLiveData = MutableLiveData<Single<List<Animal>>>()

    val animalListLiveData = _animalListLiveData as LiveData<List<Animal>>

    init {
        _animalListLiveData.value = getAnimalListUseCase.execute()
    }
}