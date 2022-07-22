package com.vast.retrofit.data.di

import com.vast.retrofit.data.repositories.AnimalRepositoryImpl
import com.vast.retrofit.domain.animals.AnimalRepository
import org.koin.dsl.module

val dataModule = module {
    single<AnimalRepository> {
        AnimalRepositoryImpl(animalApiService = get())
    }
}