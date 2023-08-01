package com.app.aprendizadokotlin.colecoesarrayslistas.collections

fun main() {
    // Comportamentos do map usando leitura
    val pedidos = mutableMapOf(
        Pair(1, 20.00),
        Pair(2, 34.0),
        3 to 50.00
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
    pedidos[4] = 70.00
    println(pedidos)
    pedidos.put(5, 80.00)
    println(pedidos)

    // atualizando pedidos
    pedidos[1] = 100.00
    println(pedidos)

    // adiciona se o pedido não existe
    pedidos.putIfAbsent(6, 200.00)
    println(pedidos)

    // remove o pedido
    pedidos.remove(6)
    println(pedidos)

}





