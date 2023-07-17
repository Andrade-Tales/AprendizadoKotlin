import com.app.aprendizadokotlin.bytebank.exception.FalhaAutenticacaoException
import com.app.aprendizadokotlin.bytebank.exception.SaldoInsuficienteException
import com.app.aprendizadokotlin.bytebank.modelo.Cliente
import com.app.aprendizadokotlin.bytebank.modelo.ContaCorrente
import com.app.aprendizadokotlin.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaAlex = ContaCorrente(titular = alex, numero = 1000)
    contaAlex.deposita(200.0)

    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)
    val contaFran = ContaCorrente(titular = fran, numero = 1001)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")

    try {
        contaFran.transfere(destino = contaAlex, valor = 250.0, senha = 2)
        println("Transferência bem sucedida")

        // Capturando erro de falha na transferência e saldo insuficiente
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferência")
        println("Saldo insuficiente")
        e.printStackTrace()
        // Capturando erro de falha na transferência e autenticação
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na transferência")
        println("Falha na Autenticação")
        e.printStackTrace()
        // Capturando erro desconhecido ou exceptions genéricas
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}
