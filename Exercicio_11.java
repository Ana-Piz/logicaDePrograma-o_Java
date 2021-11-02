package logica_programacao_lista4;

/*Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro
 *  valor pelo segundo.
 */

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		int A, B, resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro para A: ");
		A = teclado.nextInt();
		System.out.println("Digite um valor inteiro para B: ");
		B = teclado.nextInt();
	
		resultado = A - B;
		resultado = (int) Math.pow(resultado, 2);
		
		System.out.println("Resultado do quadrado: " + resultado);
		
		teclado.close();

	}

}
