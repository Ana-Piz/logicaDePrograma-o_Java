package logica_programacao_lista5;

//25.Desenvolva um programa que dado um número, calcule e exiba se ele é par ou ímpar.

import java.util.Scanner;

public class Exercicio_25 {

	public static void main(String[] args) {
		int valor = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor para saber se é par ou é impar: ");
		valor = teclado.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("O número digitado " + valor + " é par.");
		}else {
			System.out.println("O número digitado " + valor + " é impar.");
		}
		
		teclado.close();
	}

}
