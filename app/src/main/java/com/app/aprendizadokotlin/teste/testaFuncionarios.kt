import com.app.aprendizadokotlin.modelo.Analista
import com.app.aprendizadokotlin.modelo.CalculadoraBonificacao
import com.app.aprendizadokotlin.modelo.Diretor
import com.app.aprendizadokotlin.modelo.Gerente

fun testaFuncionarios() {

    // Funcionario (cargo gerente)
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    // Testando Funcionários com seus respectivos cargos e salários
    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao}")

    // Funcionário (cargo gerente)
    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    // Testando Funcionários com seus respectivos cargos e salários
    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao}")

    // Autenticação
    if (fran.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autentição")
    }

    // Funcionário (cargo diretor)
    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    // Testando Funcionários com seus respectivos cargos e salários
    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")

    // Autenticação
    if (fran.autentica(4000)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autentição")
    }

    // Funcionário (cargo analista)
    val maria = Analista(
        nome = "maria",
        cpf = "444.444.444-4",
        salario = 3000.0
    )

    // Testando Funcionários com seus respectivos cargos e salários
    println("nome ${maria.nome}")
    println("cpf ${maria.cpf}")
    println("salario ${maria.salario}")


    // Testando a calculadora de bonificação
    val calculadora = CalculadoraBonificacao()
    calculadora.resgistra(alex)
    calculadora.resgistra(fran)
    calculadora.resgistra(gui)
    calculadora.resgistra(maria)

    println("total bonificação: ${calculadora.total}")
}
