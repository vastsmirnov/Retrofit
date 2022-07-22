package com.vast.retrofit.domain.animals

import rx.Single

class GetAnimalListUseCaseImpl(val animalRepository: AnimalRepository): GetAnimalListUseCase {
    override fun execute(): Single<List<Animal>> {
        return animalRepository.getList()
    }
}