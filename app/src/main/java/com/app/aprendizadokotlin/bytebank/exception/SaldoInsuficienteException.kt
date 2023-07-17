package com.app.aprendizadokotlin.bytebank.exception

// classe responsável para tratamento de exception
class SaldoInsuficienteException(mensagem: String = "O saldo é insuficiente") : Exception(mensagem)