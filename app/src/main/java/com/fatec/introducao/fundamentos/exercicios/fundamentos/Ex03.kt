package com.fatec.introducao.fundamentos.exercicios.fundamentos

fun main(){
//    Objetivo: Crie uma lista de strings. Use a função filter para extrair apenas as strings
//    que contêm a letra 'a', independente de ser maiúscula ou minúscula. Em seguida, use a
//    função forEach para imprimir cada uma das strings filtradas, em uma nova linha.
//
//    Teste de Mesa:
//    Entrada: listOf("Kotlin", "Android", "Mobile", "Jetpack", "Java")

    val palavras = listOf("Kotlin", "Android", "Mobile", "Jetpack", "Java")

    println("Palavras: $palavras")

    palavras
        .filter { it.contains("a", ignoreCase = true) }
        .forEach { println(it) }
}