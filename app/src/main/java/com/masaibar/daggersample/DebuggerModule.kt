package com.masaibar.daggersample

import android.content.Context
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
