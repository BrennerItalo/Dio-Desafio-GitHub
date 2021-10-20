package digitalInnovation.Desafios

import java.util.Scanner;

//Recebe dois valores inteiros em uma linha apenas e retorna a média em ponto flutuante
fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`)
    val H:Int = leitor.nextInt()
    val P:Int = leitor.nextInt()
    val media: Double = H.toDouble() / P.toDouble();
    println(String.format("%.2f", media))
}