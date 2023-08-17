package com.app.aprendizadokotlin.paradigmafuncional


fun testaTipoFuncaoLambda() {
//    val testaTipoFuncaoLambda =  {
//        println("Executa como lambda")
//    }

    // soma usando lambda
//    val testaTipoFuncaoLambda: (Int, Int) -> Int = { a, b ->
//        println("Executa como lambda")
//        a + b
//    }
//    println(testaTipoFuncaoLambda(15, 10))

    // soma usando lambda com inferência de tipo
    val testaTipoFuncaoLambda = { a: Int, b: Int ->
        a + b
    }
    println(testaTipoFuncaoLambda(15, 10))

    // LAMBDAS COM MÚLTIPLOS RETORNOS
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if(salario > 1000.0){
            return@lambda salario + 50
        }
        salario + 100.0
    }
    println(calculaBonificacao(1000.0))

    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if(salario > 1000.0){
            return salario + 50
        }
        return salario + 100.0
    }
    println(calculaBonificacaoAnonima(1100.0))

}

