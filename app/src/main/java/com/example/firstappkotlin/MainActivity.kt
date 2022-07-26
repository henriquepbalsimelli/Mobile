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
        // Abaixo estou me comunicando com a view (bind de views)
        setContentView(R.layout.activity_main)
        val nome = findViewById<TextView>(R.id.nome)
        nome.text = "Cesta de Frutas"

        val descricao = findViewById<TextView>(R.id.descricao)
        descricao.text = "Laranja mecâninca"

        val valor = findViewById<TextView>(R.id.constraint)
        valor.text = "R$19,00"
    }
}