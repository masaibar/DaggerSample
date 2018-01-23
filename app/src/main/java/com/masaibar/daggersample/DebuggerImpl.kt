package com.masaibar.daggersample

class DebuggerImpl(val debugger: Debugger) {

    fun showText(text: String) {
        debugger.showText(text)
    }
}