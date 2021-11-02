package logica_programacao_lista5;

//44.Efetuar a leitura de 5 valores inteiros e exibir na tela o menor e o maior deles.

import java.util.Scanner;	

public class Exercicio_44 {

	public static void main(String[] args) {
		int A, B, C, D, E;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		A = teclado.nextInt();
		System.out.println("Digite o segundo valor");
		B = teclado.nextInt();
		System.out.println("Digite o terceiro valor");
		C = teclado.nextInt();
		System.out.println("Digite o quarto valor");
		D = teclado.nextInt();
		System.out.println("Digite o quinto valor");
		E = teclado.nextInt();
		
		if((A > B) && (A > C) && (A > D) && (A > E)) {
			System.out.println("O maior valor: " + A);
		}else if((B > A) && (B > C) && (B > D) && (B > E)){
			System.out.println("O maior valor: " + B);
		}else if((C > A) && (C > B) && (C > D) && (C > E)){
			System.out.println("O maior valor: " + C);
		}else if((D > A) && (D > B) && (D > C) && (D > E)){
			System.out.println("O maior valor: " + D);
		}else {
			System.out.println("O maior valor: " + E);
		}
		
		if((A < B) && (A < C) && (A < D) && (A < E)) {
			System.out.println("O menor valor: " + A);
		}else if((B < A) && (B < C) && (B < D) && (B < E)){
			System.out.println("O menor valor: " + B);
		}else if((C < A) && (C < B) && (C < D) && (C < E)){
			System.out.println("O menor valor: " + C);
		}else if ((D < A) && (D < B) && (D < C) && (D < E)){
			System.out.println("O menor valor: " + D);
		}else {
			System.out.println("O menor valor: " + E);
		}				
		
	teclado.close();

	}

}
