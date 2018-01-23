package com.masaibar.daggersample

import android.content.Context
import android.widget.Toast

class Debugger(private val context: Context) {

    fun showText(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}