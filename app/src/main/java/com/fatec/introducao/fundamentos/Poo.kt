package com.fatec.testeyuri.fundamentos

import com.fatec.testeyuri.model.Animal
import com.fatec.testeyuri.model.Cachorro
import com.fatec.testeyuri.model.DiaSemana
import com.fatec.testeyuri.model.Pessoa
import com.fatec.testeyuri.model.Usuario

fun main() {
    // Objeto (instância da classe)
    val pessoa = Pessoa("Joao", 30)
    println("Nome da pessoa: "+pessoa.nome)
    println("Idade da pessoa: "+pessoa.idade)
    pessoa.fazerAniversario()

    println("----------------")

    val meuAnimal: Animal = Cachorro(nome="Toto")
    meuAnimal.emitirSom()

    println("----------------")

    val usuario1 = Usuario("Yuri",25)
    println(usuario1)
    val usuarioAtualizado = usuario1.copy(idade = 26)
    println(usuarioAtualizado)

    println("------ENUM----------")

    val hoje = DiaSemana.QUARTA
    println("Hoje e ${hoje.name}")
    println("Hoje e ${hoje.sigla}")

}