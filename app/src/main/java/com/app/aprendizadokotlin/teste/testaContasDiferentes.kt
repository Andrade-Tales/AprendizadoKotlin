import com.app.aprendizadokotlin.modelo.ContaCorrente
import com.app.aprendizadokotlin.modelo.ContaPoupanca

private fun testaContasDiferentes() {

    val contaCorrente = ContaCorrente(titular = "Alex", numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = "Fran", numero = 1001)

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
