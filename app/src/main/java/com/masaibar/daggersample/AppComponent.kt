package com.masaibar.daggersample

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, DebuggerModule::class])

interface AppComponent {
    fun inject(mainActivity: MainActivity)
}