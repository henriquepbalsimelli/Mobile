package com.example.firstappkotlin.model

import java.math.BigDecimal

data class Produto( //data class implementa algumas propriedades automaticamente
    val nome: String,
    val descricao: String,
    val valor: BigDecimal,
)
