package com.vast.retrofit.presentation.animals

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vast.retrofit.domain.animals.Animal
import com.vast.retrofit.domain.animals.GetAnimalListUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable

class AnimalListViewModel(private val getAnimalListUseCase: GetAnimalListUseCase) : ViewModel() {
    private val compositeDisposable = CompositeDisposable()

    private val _animalListLiveData = MutableLiveData<List<Animal>>()

    val animalListLiveData = _animalListLiveData as LiveData<List<Animal>>

    init {
       load()
    }

    private fun load() {
        compositeDisposable.add(
            getAnimalListUseCase.execute()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    _animalListLiveData.value = it
                }, {
                    _animalListLiveData.value = emptyList()
                })
        )
    }
}