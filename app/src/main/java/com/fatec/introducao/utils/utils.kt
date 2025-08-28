package com.fatec.introducao.utils



fun checkAge() {
    val age = 25
    if (age >= 18) {
        println("Você é maior de idade")
    } else {
        println("Você é menor de idade")
    }
}

fun dayOfWeek(){
    val dayOfWeek = 3
    when(dayOfWeek){
        1-> println("Domingo")
        2-> {
            println("Segunda")
            println("Feira")
        }
        else-> println("Dia Inválido")
    }
}