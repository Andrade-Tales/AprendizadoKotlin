package com.app.aprendizadokotlin.colecoesarrayslistas.collections.maps

fun testaAssociacao() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)
    )
    println(pedidos)
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido ->
        pedido.numero
    }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    // regra de negócio: se pedidos forem maior que 50 = frete grátis
    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido: Pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)

    // Busca por pedido
    println(pedidosFreteGratis[Pedido(numero = 1, valor = 20.0)])

//    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido -> pedido.valor > 50.0 }
//    println(mapa)

    // agrupamento de valores
    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> =
        pedidos.groupBy { pedido: Pedido ->
            pedido.valor > 50
        }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[false])

    // agrupamento por nomes
    val nomes = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Ana",
        "Paulo",
        "Maria",
        "Mario",
        "Gisele"
    )

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }

    println(agenda)

    // agrupando pela letra A
    println(agenda['A'])
}

data class Pedido(val numero: Int, val valor: Double)