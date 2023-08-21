package com.app.aprendizadokotlin.bytebank.modelo

class SistemaInterno { // aplicando high order function

    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao bytebank, autenticação feita com sucesso")
            autenticado()
        } else {
            println("Falha na autenticação")
        }

    }

    // utilização do receiver
    fun entraReceiver(admin: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao bytebank, autenticação feita com sucesso")
            autenticado(this)
        } else {
            println("Falha na autenticação")
        }

    }

    // função pagamento
    fun pagamento(){
        println("realizando pagamento")
    }

}

