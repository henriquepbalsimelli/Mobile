package com.example.firstappkotlin

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = TextView(
            this
        )
        view.setText("Cesta de frutas")
        // a partir do R eu consigo acessar tudo que eu tenho na pasta res
        setContentView(R.layout.activity_main)
    }
}