package logica_programacao_lista5;

//25.Desenvolva um programa que dado um n�mero, calcule e exiba se ele � par ou �mpar.

import java.util.Scanner;

public class Exercicio_25 {

	public static void main(String[] args) {
		int valor = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor para saber se � par ou � impar: ");
		valor = teclado.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("O n�mero digitado " + valor + " � par.");
		}else {
			System.out.println("O n�mero digitado " + valor + " � impar.");
		}
		
		teclado.close();
	}

}
