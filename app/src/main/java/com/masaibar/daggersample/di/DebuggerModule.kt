package com.masaibar.daggersample.di

import android.content.Context
import com.masaibar.daggersample.Debugger
import com.masaibar.daggersample.DebuggerImpl
import com.masaibar.daggersample.ToastDebugger
import dagger.Module
import dagger.Provides

@Module
class DebuggerModule {

    @Provides
    fun provideDebugger(context: Context): Debugger {
        return ToastDebugger(context)
//        return LogcatDebugger()
    }

    @Provides
    fun provideDebuggerImpl(debugger: Debugger): DebuggerImpl {
        return DebuggerImpl(debugger)
    }
}
