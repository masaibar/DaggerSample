package com.masaibar.daggersample

class DebuggerImpl(private val debugger: Debugger) {

    fun showText(text: String) {
        debugger.showText(text)
    }
}