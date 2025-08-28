package com.fatec.testeyuri.model

class Cachorro(
    nome:String
):Animal(nome) {
    override fun emitirSom() {
//        super.emitirSom()
        println("$nome faz au-au!")
    }
}