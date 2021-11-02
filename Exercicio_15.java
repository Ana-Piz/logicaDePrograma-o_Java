package logica_programacao_lista4;

//Elaborar um programa que efetue a leitura de três valores. (A, B e C) e apresente como resultado
//final o quadrado da soma dos três valores lidos.

import java.util.Scanner;

public class Exercicio_15 {

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
		
		result = Math.pow(A + B + C, 2);
		
		System.out.println("Quadrado da soma: " + result);
		
		teclado.close();
	}
}	
	