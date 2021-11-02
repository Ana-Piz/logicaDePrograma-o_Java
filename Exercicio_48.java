package logica_programacao_lista5;

//48.Efetuar a leitura de três valores (variáveis A, B e C) e apresentar os valores dispostos em ordem crescente.

import java.util.Scanner;

public class Exercicio_48 {

	public static void main(String[] args) {
		int A , B, C;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		A = teclado.nextInt();
		System.out.println("Digite o segundo valor");
		B = teclado.nextInt();
		System.out.println("Digite o terceiro valor");
		C = teclado.nextInt();
	
		if ((A < B) && (A < C) && (B < C)){	     
			System.out.println("A ordem crescente é: " + A + ", " + B + ", " + C);
		}else if ((B < A) && (B < C) && (A < C)) {
			System.out.println("A ordem crescente é: " + B +", " + A + ", " + C);
		}	  
		if ((C < B) && (C < A) && (A < B)) {	     
			System.out.println("A ordem crescente é: " + C + ", " + A + ", " + B);
		} else if ((B < A) && (B < C) && (C < A)) {	 
	        System.out.println("A ordem crescente é: " + B + ", " + C + ", " + A);
		}	  
		if ((C < B) && (C < A) && (B < A)) {
			System.out.println("A ordem crescente é: " + C + ", " + B + ", " + A);
		} else if ((A < B) && (A < C) && (C < B)) {
			System.out.println("A ordem crescente é: " + A + ", " + C + ", " + B);
		}

	  	
		teclado.close();

	}

}
