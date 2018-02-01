package com.masaibar.daggersample.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val application: Application) {

    @Provides
    fun provideApplicationContext(): Context {
        return application.applicationContext
    }
}