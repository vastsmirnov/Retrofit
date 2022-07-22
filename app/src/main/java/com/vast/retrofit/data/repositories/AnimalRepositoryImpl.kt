package com.vast.retrofit.data.repositories

import com.vast.retrofit.data.net.animals.AnimalService
import com.vast.retrofit.domain.animals.Animal
import com.vast.retrofit.domain.animals.AnimalRepository
import io.reactivex.Single

class AnimalRepositoryImpl(val animalApiService: AnimalService): AnimalRepository {
    override fun getList(): Single<List<Animal>> {
        return animalApiService.getList()
    }
}