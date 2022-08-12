package com.example.firstappkotlin.ui.activity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.firstappkotlin.R
import com.example.firstappkotlin.dao.ProdutosDao
import com.example.firstappkotlin.model.Produto
import java.math.BigDecimal

class FormularioProdutoActivity : AppCompatActivity(R.layout.activity_formulario_produto) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val botaoSalvar = findViewById<Button>(R.id.botao_salvar)//processo de binding
        configuraBotaoSalvar(botaoSalvar)
    }

    private fun configuraBotaoSalvar(botaoSalvar: Button) {
        botaoSalvar.setOnClickListener {
            val produtoNovo = criaProduto()

            Log.i("FormularioProduto", "Oncreate: $produtoNovo")
            val dao = ProdutosDao()

            dao.adiciona(produtoNovo)
            Log.i("FormularioProduto", "Oncreate: ${dao.buscaTodos()}")
            finish()
        }
    }

    private fun criaProduto(): Produto {
        val campoNome = findViewById<EditText>(R.id.produto_item_nome)
        val nome = campoNome.text.toString()

        val campoDescricao = findViewById<EditText>(R.id.produto_item_descricao)//processo de binding
        val descricao = campoDescricao.text.toString()

        val campoValor = findViewById<EditText>(R.id.produto_item_valor) //processo de binding
        val valorEmTexto = campoValor.text.toString()

        val valor = if (valorEmTexto.isBlank()) {
            BigDecimal.ZERO
        } else {
            BigDecimal(valorEmTexto)
        }

        return Produto(
            nome = nome,
            descricao = descricao,
            valor = valor
        )
    }
}