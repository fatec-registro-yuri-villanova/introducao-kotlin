package com.fatec.introducao.fundamentos.exercicios.fundamentos

fun main() {
//    Objetivo: Crie um mapa mutável (mutableMapOf)
//    para armazenar o nome e a nota de alunos.
//    Adicione três alunos, remova um deles e
//    atualize a nota de outro. Imprima o mapa final para verificar as alterações.
    val alunos = mutableMapOf<String, Double>()

    alunos["Ana"] = 8.5
    alunos["Bruno"] = 7.0
    alunos["Carlos"] = 9.5
    println("Alunos $alunos")

    alunos.remove("Bruno")
    println("Alunos s/ Bruno $alunos")

    alunos["Ana"] = 9.0
    println("Alunos ana nota atualizada $alunos")

}