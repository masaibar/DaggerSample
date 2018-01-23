package com.masaibar.daggersample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var debugger: DebuggerImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        debugger = DebuggerImpl(ToastDebugger(this))

        button.setOnClickListener {
            debugger.showText("hoge")
        }
    }
}
