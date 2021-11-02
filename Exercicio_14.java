package logica_programacao_lista4;

/*
 * .Elaborar um programa que efetue a leitura de três valores. (A, B e C) e apresente como 
 * resultado final a soma dos quadrados dos três valores lidos.
 */

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		int A, B, C;
		double result;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		A = teclado.nextInt();
		System.out.println("Digite o segundo valor: ");
		B = teclado.nextInt();
		System.out.println("Digite o terceiro valor: ");
		C = teclado.nextInt();
		
		result = Math.pow(A,2) + Math.pow(B,2) + Math.pow(C,2);
		
		System.out.println("Soma dos quadrados: " + result);
		
		teclado.close();
	}

}
