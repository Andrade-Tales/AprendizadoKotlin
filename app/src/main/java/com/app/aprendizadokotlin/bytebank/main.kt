import com.app.aprendizadokotlin.bytebank.modelo.Autenticavel
import com.app.aprendizadokotlin.bytebank.modelo.Cliente
import com.app.aprendizadokotlin.bytebank.modelo.Conta
import com.app.aprendizadokotlin.bytebank.modelo.ContaCorrente
import com.app.aprendizadokotlin.bytebank.modelo.ContaPoupanca
import com.app.aprendizadokotlin.bytebank.modelo.SistemaInterno

fun main() {

    val fran = object : Autenticavel { // Uso de objeto anônimo (object expression)
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha // Sobrescrita do método autentica
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)

    println("nome do cliente ${fran.nome}")

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1001)

    testaContasDiferentes()

    println("Total de contas: ${Conta.total}")
}







