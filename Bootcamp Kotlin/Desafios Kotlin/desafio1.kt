package digitalInnovation.Desafios

//Recebe cinco valores inteiros e retornando os valores divididos em 4 categorias : par - impár - negativo - positivo
fun main(args: Array<String>) {

    val inteiros = mutableListOf<Int>()
    var positivos = mutableListOf<Int>()
    var impares = mutableListOf<Int>()
    var pares  = mutableListOf<Int>()
    var negativos  = mutableListOf<Int>()
    // Declarando as variáveis.

    for (i in 1..5) { inteiros.add(readLine()!!.toInt()) }

    for (i in inteiros) {
        //TODO Criando as condições necessárias.
        if ( i % 2 == 0 ) { pares.add(i) }
        if ( i % 2 == 1 || i % 2 == -1 ) { impares.add(i) }
        if ( i > 0 ) { positivos.add(i) }
        if ( i < 0 ) { negativos.add(i) }
    }

    //TODO Imprima os valores adequadamente.
    println("${pares.size} par(es)")
    println("${impares.size} impar(es)")
    println("${positivos.size} positivo(s)")
    println("${negativos.size} negativo(s)")

}
