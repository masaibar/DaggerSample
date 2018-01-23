package com.masaibar.daggersample

import android.util.Log

class LogcatDebugger :Debugger {
    override fun showText(text: String) {
        Log.d(LogcatDebugger::class.java.simpleName, text)
    }
}