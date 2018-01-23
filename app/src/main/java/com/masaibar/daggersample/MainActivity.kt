package com.masaibar.daggersample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var debugger: DebuggerImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.builder()
                .appModule(AppModule(application))
                .build().inject(this)

        button.setOnClickListener {
            debugger.showText("hoge")
        }
    }
}
