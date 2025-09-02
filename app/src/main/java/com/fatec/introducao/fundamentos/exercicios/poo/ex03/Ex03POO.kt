package com.fatec.introducao.fundamentos.exercicios.poo.ex03

fun main(){
    val tv = Produto("Tv",2000.0)
    val precoFinal = tv.aplicarDesconto(10.0)

    println("O valor final do ${tv.nome} é de $precoFinal")
}