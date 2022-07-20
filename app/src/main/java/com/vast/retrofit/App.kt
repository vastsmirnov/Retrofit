package com.vast.retrofit

import android.app.Application
import com.vast.retrofit.data.di.dataModule
import com.vast.retrofit.domain.di.domainModule
import com.vast.retrofit.presentation.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                presentationModule
                    + domainModule
                    + dataModule)
        }
    }
}