package com.vast.retrofit.domain.animals

import com.vast.retrofit.domain.animals.Animal
import rx.Single

interface AnimalRepository {
    fun getList(): Single<List<Animal>>
}