package com.app.aprendizadokotlin.bytebank.teste

import com.app.aprendizadokotlin.bytebank.exception.SaldoInsuficienteException

class testaPilha {

    fun funcao1() {
        println("início funcao1")
        try {
            funcao2()
        } catch (e: ClassCastException) {
            e.printStackTrace()
            println("SaldoInsuficienteException foi pega")
        }
        println("fim funcao1")
    }

    fun funcao2() {
        println("início funcao2")
        for (i in 1..5) {
            println(i)
            throw SaldoInsuficienteException()
        }
        println("fim funcao2")
    }
}