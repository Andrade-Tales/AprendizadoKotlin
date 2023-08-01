package com.app.aprendizadokotlin.colecoesarrayslistas.collections

 fun testaSet() {
    // lista de pessoas
    // coleção  Set (conjunto que não se repete)
    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: MutableSet<String> = mutableSetOf("Alex", "Paulo", "Maria")

    // lista mutável de String
    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin

    // função distinct devolver uma nova lista com elementos distintos / (sem repetir os nomes da lista)
    println(assistiramAmbos.distinct())

    println(assistiramCursoKotlin + assistiramCursoAndroid)
    // função Union: Operar união (união entre conjuntos)
    println(assistiramCursoKotlin union assistiramCursoAndroid)

    // função subtract: Operar subtração
    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    // função: intersect: Operar membros de ambos conjuntos
    println(assistiramCursoAndroid intersect assistiramCursoKotlin)

    //
    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())
}