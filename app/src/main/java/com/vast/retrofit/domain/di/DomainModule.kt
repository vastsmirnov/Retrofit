package com.vast.retrofit.domain.di

import com.vast.retrofit.domain.animals.GetAnimalListUseCase
import com.vast.retrofit.domain.animals.GetAnimalListUseCaseImpl
import org.koin.dsl.module

val domainModule = module {
    single<GetAnimalListUseCase> {
        GetAnimalListUseCaseImpl(animalRepository = get())
    }
}