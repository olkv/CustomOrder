package com.example.customorder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    var LogInLoyout: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Init()
    }

    private fun Init() {
        LogInLoyout = findViewById(R.id.LogInLayout)

        //По умолчанию окно авторизации должно быть включено, если авторизация есть тогда выключаем
        LogInLoyout?.visibility = View.VISIBLE

    }
}