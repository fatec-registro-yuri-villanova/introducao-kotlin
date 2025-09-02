package com.fatec.introducao.fundamentos.exercicios.poo.ex01

fun main(){
    val calculadora = Calculadora(valor1 = 10.0, valor2 = 5.0)

    println("Soma: ${calculadora.somar()}")
    println("Subtracao: ${calculadora.subtrair()}")
    println("Multiplicacao: ${calculadora.multiplicar()}")
    println("Divisao: ${calculadora.dividir()}")
}