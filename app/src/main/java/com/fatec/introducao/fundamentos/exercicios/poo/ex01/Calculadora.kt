package com.fatec.introducao.fundamentos.exercicios.poo.ex01

class Calculadora(
    val valor1:Double,
    val valor2:Double
)
{
    fun somar():Double{
        return valor1 + valor2
    }

    fun subtrair():Double{
        return valor1 - valor2
    }

    fun multiplicar():Double{
        return valor1 * valor2
    }

    fun dividir():Double{
        if (valor2 == 0.0){
            throw IllegalArgumentException("Divisão por zero não é permitida")
        }
        return valor1 / valor2
    }
}