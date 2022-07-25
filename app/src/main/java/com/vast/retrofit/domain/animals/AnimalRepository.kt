package com.vast.retrofit.domain.animals

import io.reactivex.Single

interface AnimalRepository {
    fun getList(): Single<List<Animal>>
}