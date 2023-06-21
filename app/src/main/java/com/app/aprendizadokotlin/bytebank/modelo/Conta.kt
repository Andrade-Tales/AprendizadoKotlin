package com.app.aprendizadokotlin.bytebank.modelo

abstract class Conta(
    var titular: Cliente, // Uso de herança
    val numero: Int
) {
    var saldo = 0.0
        protected set

    companion object {
        /*  Uso de objeto "anônimo" (object declaration).
            Companion object para uso do seu incremento nas demais funções da classe
            Uso da assinatura do método privado, sendo companion object seu comportamento será o de
            um membro próprio da classe
         */
        var total = 0
            private set
    }

    init { // Incrementando cada conta criada para contabilizar contas
        println("Criando conta")
        total++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

class ContaCorrente(
    titular: Cliente, numero: Int
) : Conta(
    titular = titular, numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}

class ContaPoupanca(
    titular: Cliente, numero: Int
) : Conta(
    titular = titular, numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}