package com.app.aprendizadokotlin.POO.testePOO

import com.app.aprendizadokotlin.modelo.Cliente
import com.app.aprendizadokotlin.modelo.Diretor
import com.app.aprendizadokotlin.modelo.Gerente
import com.app.aprendizadokotlin.modelo.SistemaInterno

private fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-1",
        salario = 1000.0,
        senha = 1000
    )

    val diretora = Diretor(
        nome = "Fran",
        cpf = "222.222.222-2",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "333.333.333-3",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
    sistema.entra(cliente, 1234)

}
