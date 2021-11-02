package logica_programacao_lista5;

//43.Efetuar a leitura de 4 valores inteiros e exibir na tela o menor e o maior deles.

import java.util.Scanner;		

public class Exercicio_43 {

	public static void main(String[] args) {
		int A, B, C, D;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		A = teclado.nextInt();
		System.out.println("Digite o segundo valor");
		B = teclado.nextInt();
		System.out.println("Digite o terceiro valor");
		C = teclado.nextInt();
		System.out.println("Digite o quarto valor");
		D = teclado.nextInt();
		
		if((A > B) && (A > C) && (A > D)) {
			System.out.println("O maior valor: " + A);
		}else if((B > A) && (B > C) && (B > D)){
			System.out.println("O maior valor: " + B);
		}else if((C > A) && (C > B) && (C > D)){
			System.out.println("O maior valor: " + C);
		}else {
			System.out.println("O maior valor: " + D);
		}
		
		if((A < B) && (A < C) && (A < D)) {
			System.out.println("O menor valor: " + A);
		}else if((B < A) && (B < C) && (B < D)){
			System.out.println("O menor valor: " + B);
		}else if((C < A) && (C < B) && (C < D)){
			System.out.println("O menor valor: " + C);
		}else {
			System.out.println("O menor valor: " + D);
		}				
		
	teclado.close();
	
	}

}
