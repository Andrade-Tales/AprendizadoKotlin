import com.app.aprendizadokotlin.POO.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao bytebank, autenticação feita com sucesso")
        } else {
            println("Falha na autenticação")
        }

    }


}