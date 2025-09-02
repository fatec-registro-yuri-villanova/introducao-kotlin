package com.fatec.introducao.fundamentos.exercicios.poo.ex02

open class Animal(val nome:String) {
    open fun emitirSom(){
        println("O animal faz um som")
    }
}

class Cachorro(nome:String):Animal(nome){
    override fun emitirSom() {
        println("O $nome faz Au Au")
    }
}

class Gato(nome:String):Animal(nome){
    override fun emitirSom() {
        println("O $nome faz Miau Miau")
    }
}