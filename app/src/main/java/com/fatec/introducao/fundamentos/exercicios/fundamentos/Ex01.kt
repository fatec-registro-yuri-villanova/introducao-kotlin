package com.fatec.introducao.fundamentos.exercicios.fundamentos

fun main(){
    val numeros = listOf(1, 2, 3, 4, 5,6,7,8,9,10)
    println("Numeros inteiros:$numeros")

    val numerosPares = numeros.filter { it % 2 == 0}
    println("Numeros pares:$numerosPares")

    val resultado = numerosPares.map { it * 2  }
    println("Numeros multiplicados por 2 :$resultado")
}