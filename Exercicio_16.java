package logica_programacao_lista4;

//Elaborar um programa que apresente o produto da soma pela diferença do quadrado de dois valores
//lidos.

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		int A, B;
		double result;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		A = teclado.nextInt();
		System.out.println("Digite o segundo valor: ");
		B = teclado.nextInt();

		result = (Math.pow(A, 2) + Math.pow(B, 2)) * (Math.pow(A, 2) - Math.pow(B, 2));
		
		System.out.println("Resultado: " + result);
		
		teclado.close();
	}

}
