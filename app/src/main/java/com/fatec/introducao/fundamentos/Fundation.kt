package com.fatec.testeyuri.fundamentos

fun main() {
    println("--- Exemplo de variaveis em Kotlin ---")
    // Variável imutável
    val pi: Double = 3.14
    println("Valor de pi (val): $pi")

    // Variável mutável
    var count: Int = 0
    println("Valor inicial de count (var): $count")

    count = 1 // Isso é permitido
    println("Novo valor de count (var): $count")
    // pi = 3.14159 // Isso causaria um erro de compilação


    var nome: String = "Joao" // Non-nullable
    var sobrenome: String? = null // Nullable

    println("Valor de nome: $nome")
    println("Valor de sobrenome: $sobrenome")

    // Safe Call: o código só será executado se a variável não for nula
    val tamanho: Int? = sobrenome?.length
    println("Valor de tamanho: $tamanho")

    // Elvis Operator: se a variável for nula, o valor padrão é usado
    val tamanhoNaoNulo: Int = sobrenome?.length ?: 0
    println("Valor de tamanhoNaoNulo: $tamanhoNaoNulo")

    println("------------------Funcoes-------------------")

    sayHello("Yuri")

    println("------------------Colecoes-------------------")

    val nomes = listOf("Joao", "Maria", "Pedro") // Lista imutável
    val notas = mutableListOf(8, 7, 9) // Lista mutável
    notas.add(10)
    println("List Nomes: $nomes")
    println("List Notas: $notas")

    val frutas = setOf("Maca", "Banana", "Morango", "Maca")
    // frutas conterá apenas "Maca", "Banana", "Morango"
    println("Set frutas: $frutas")

    val idades = mapOf("Joao" to 30, "Maria" to 25)
    // idades["João"] = 31 // Erro de compilação!
    println("Map idades: $idades")

    val alunos = mutableMapOf<String, Int>()
    alunos["Pedro"] = 28
    alunos.put("Ana", 22)
    alunos.remove("Pedro")
    // alunos agora contém apenas um par: ("Ana" to 22)
    println("Map alunos: $alunos")


    println("------------------Funcoes de Ordem Superior/Lambda -------------------")
    val numeros = listOf(1, 2, 3, 4)
    val quadrados = numeros.map { it * it }
    // quadrados será [1, 4, 9, 16]
    println("Map quadrados: $quadrados")

    val numerosPares = listOf(1, 2, 3, 4, 5, 6)
    val pares = numerosPares.filter { it % 2 == 0 }
    // pares será [2, 4, 6]
    println("Map pares: $pares")

    val names = listOf("Ana", "Bruno", "Carlos")
    names.forEach { println("Ola, $it!") }

    println("-------------------------------------")
}

fun sayHello(name: String) {
    println("Ola, $name")
}