package com.app.aprendizadokotlin.colecoesarrayslistas.collections

 fun testaColecao() {
     // MutableIterable tem referências mais restritas. No MutableCollection não, existe referências
     // restritas menos
    val nomes: MutableCollection<String> = mutableListOf(
        "Lucas",
        "Fran",
        "Bruno",
        "Maria",
        "Ana"
    )
    nomes.add("Paulo")
    nomes.remove("Bruno")
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome Lucas? ${nomes.contains("Lucas")}")
    println("Tamanho da coleção ${nomes.size}")
}