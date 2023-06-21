import com.app.aprendizadokotlin.bytebank.modelo.Cliente
import com.app.aprendizadokotlin.bytebank.modelo.ContaCorrente
import com.app.aprendizadokotlin.bytebank.modelo.ContaPoupanca
import com.app.aprendizadokotlin.bytebank.modelo.Endereco

fun testaContasDiferentes() {

    val contaCorrente =
        ContaCorrente(
            titular = Cliente(
                nome = "Alex", cpf = "111.111.111-1", senha = 1,
                endereco = Endereco(logradouro = "Rua Vergueiro")
            ), numero = 1000
        )

    println("nome do titular: ${contaCorrente.titular.nome}")
    println("cpf do titular: ${contaCorrente.titular.cpf}")
    println("endereço do titular: ${contaCorrente.titular.endereco.logradouro}")

    val contaPoupanca =
        ContaPoupanca(titular = Cliente(nome = "Fran", cpf = "", senha = 2), numero = 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo conta corrente: ${contaCorrente.saldo}")
    println("saldo conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo conta corrente após saque: ${contaCorrente.saldo}")
    println("saldo conta poupança após saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo conta corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo conta poupança após transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("saldo conta corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo conta poupança após transferência: ${contaPoupanca.saldo}")
}
