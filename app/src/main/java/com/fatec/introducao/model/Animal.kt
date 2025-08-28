package com.fatec.testeyuri.model

open class Animal(
    val nome: String
) {
    open fun emitirSom() {
        println("O animal faz um som.")
    }
}