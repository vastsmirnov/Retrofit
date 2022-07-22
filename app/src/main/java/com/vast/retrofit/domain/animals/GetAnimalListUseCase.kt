package com.vast.retrofit.domain.animals

import rx.Single

interface GetAnimalListUseCase {
    fun execute(): Single<List<Animal>>
}