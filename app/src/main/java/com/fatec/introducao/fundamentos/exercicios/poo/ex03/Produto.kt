package com.fatec.introducao.fundamentos.exercicios.poo.ex03

class Produto(
    val nome: String,
    var preco: Double
) {
    fun aplicarDesconto(porcentagem: Double): Double {
        val desconto = preco * (porcentagem / 100)
        return preco - desconto
    }
}