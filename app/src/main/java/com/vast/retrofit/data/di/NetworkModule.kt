package com.vast.retrofit.data.di

import com.vast.retrofit.data.net.animals.AnimalService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    factory { provideLoggingInterceptor() }
    factory { provideOkHttpClient(get()) }
    factory { provideRetrofit(get()) }
    single { provideAnimalService(get()) }
}

fun provideLoggingInterceptor() {
    HttpLoggingInterceptor().level = HttpLoggingInterceptor.Level.BODY
}

fun provideOkHttpClient(interceptor: HttpLoggingInterceptor) {
    OkHttpClient.Builder()
        .addInterceptor(interceptor)
        .build()
}

fun provideRetrofit(okHttpClient: OkHttpClient) {
    Retrofit.Builder()
        .baseUrl("https://zoo-animal-api.herokuapp.com")
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
        .client(okHttpClient)
        .build()
}

fun provideAnimalService(retrofit: Retrofit): AnimalService =
    retrofit.create(AnimalService::class.java)
