package com.fatec.testeyuri.model

class Pessoa(
    val nome:String,
    val idade:Int,
){
    fun fazerAniversario(){
        var novaIdade = idade + 1
        println("Feliz aniversario, sua idade é $novaIdade")
    }
}