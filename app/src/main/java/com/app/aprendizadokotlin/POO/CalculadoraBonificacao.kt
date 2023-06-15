import com.app.aprendizadokotlin.POO.Funcionario

// Classe para soma de toda a bonificação de todos os funcionários
class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun resgistra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }

//    fun resgistra(gerente: Gerente) {
//        this.total += gerente.bonificacao
//    }

//    fun resgistra(diretor: Diretor) {
//        this.total += diretor.bonificacao
//    }
}