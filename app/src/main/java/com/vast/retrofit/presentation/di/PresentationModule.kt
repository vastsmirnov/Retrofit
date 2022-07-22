package com.vast.retrofit.presentation.di

import com.vast.retrofit.presentation.animals.AnimalListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel {
        AnimalListViewModel(getAnimalListUseCase = get())
    }
}