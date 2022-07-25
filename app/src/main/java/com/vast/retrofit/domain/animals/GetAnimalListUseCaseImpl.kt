package com.vast.retrofit.domain.animals

import io.reactivex.Single

class GetAnimalListUseCaseImpl(val animalRepository: AnimalRepository): GetAnimalListUseCase {
    override fun execute(): Single<List<Animal>> {
        return animalRepository.getList()
    }
}