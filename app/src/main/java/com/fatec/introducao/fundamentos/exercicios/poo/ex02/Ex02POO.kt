package com.fatec.introducao.fundamentos.exercicios.poo.ex02

fun main(){
    val animal = Animal(nome = "Animal")
    animal.emitirSom()

    val cachorro = Cachorro(nome = "Toto")
    cachorro.emitirSom()

    val gato = Gato(nome = "Bichano")
    gato.emitirSom()


}