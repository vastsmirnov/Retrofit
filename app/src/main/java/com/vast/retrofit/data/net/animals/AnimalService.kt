package com.vast.retrofit.data.net.animals

import com.vast.retrofit.domain.animals.Animal
import retrofit2.http.GET
import rx.Single

interface AnimalService {
    @GET("./animals/rand/10")
    fun getList(): Single<List<Animal>>
}