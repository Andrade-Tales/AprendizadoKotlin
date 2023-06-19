package com.app.aprendizadokotlin.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao bytebank, autenticação feita com sucesso")
        } else {
            println("Falha na autenticação")
        }

    }


}