package com.app.aprendizadokotlin.colecoesarrayslistas.collections.maps

// Map está fora da hierarquia de collection mas mesmo assim é considerado uma coleção
// dentro de um mapa não se repete, tem a funcionalidade de mapear chave e valor (pares)
fun testaMap() {
    // Comportamentos do map usando leitura
    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 150.0,
        6 to 80.0
    )

    // imprimindo todos os valores
    println(pedidos)

    // imprimindo valores específicos
    val pedido = pedidos[3]
    pedido?.let {
        println("pedido $it")
    }
    // p de pedido
    for (p in pedidos) {
        println("número do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }

    // adicionanado pedidos
    pedidos[4] = 70.0
    println(pedidos)
    pedidos[5] = 80.0
    println(pedidos)

    // atualizando pedidos
    pedidos[1] = 20.0
    println(pedidos)

    // adiciona se o pedido não existe
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)

    // remove o pedido
//    pedidos.remove(6)
//    println(pedidos)

    // get ou getValue, pega por chave
    val valorPedido = pedidos.getValue(5)
    println(valorPedido)

    // pegando a chave por getOrElse que exige uma expressão lambda
    val mensagem: Double? = pedidos.getOrElse(0) {
        0.0
    }

    println(mensagem)
    // o valor padrão será sempre o referente ao mapa
    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

    // imprimindo as chaves
    println(pedidos.keys)

    // imprimindo todos os valores
    println(pedidos.values)

    // navegando por todas as chaves de pedido
    for (chave in pedidos.keys) {
        println("Número do pedido: $chave")
    }

    // navegando por todos os valores de pedido
    for (valor in pedidos.values) {
        println("Valor do pedido: $valor")
    }

    // filtrando pedidos
    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }

    println(pedidosFiltrados)

    // filtrando pedidos com valor acima de 70
    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }
    println(pedidosAcima)

    // filtrando por pedidos pares
    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidosPares)

    // adicionando pedidos com map
    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))
    println(pedidos)

    // retirando pedidos com map
    println(pedidos - listOf(6, 5))
    println(pedidos)

    // sobreescrevendo pedidos com map
    //  pedidos.putAll(listOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0))

    // += : plus sobreescreve pedidos com map
    pedidos += listOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0)
    println(pedidos)

    // remoção de pedido com map (chave)
    pedidos.remove(1)
    println(pedidos)

    // remoção de pedido com map  (valor)
    pedidos.values.remove(50.0)
    println(pedidos)

    // remoção de pedidos com assign (chave)
    pedidos -= 6
    println(pedidos)


}
