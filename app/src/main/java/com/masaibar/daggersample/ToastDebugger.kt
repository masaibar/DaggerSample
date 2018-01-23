package com.masaibar.daggersample

import android.content.Context
import android.widget.Toast

class ToastDebugger(private val context: Context) : Debugger {

    override fun showText(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}