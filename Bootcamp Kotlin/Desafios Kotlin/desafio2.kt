package digitalInnovation.Desafios

import java.util.Scanner;

//Recebe um valor inteiro e um em ponto flutuante retornando a média (ponto flutuante)
fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    val x: Int = leitor.nextInt();
    val y: Float = leitor.nextFloat();
    val media: Float =  x.toFloat() / y
    println(String.format("%.3f km/l", media));
}
