package com.app.aprendizadokotlin.paradigmafuncional


/*
Para inicializar uma variável do tipo função com um objeto, implementamos uma função na classe.
Ao implementar a função, sobrescrevemos o método invoke() e, como foi mencionado, ele é
um "operador especial". Esse operador é conhecido como sobrecarga de operador ou operator overloading.

Isso significa que não precisamos implementar um tipo função para obter um invoke() em uma classe,
podemos também adicionar como um overloading operator:
 */
fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(10, 10))
}



// dois inteiros como parâmetro e um inteiro como retorno
class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b

}