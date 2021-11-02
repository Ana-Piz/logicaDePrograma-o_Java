package logica_programacao_lista5;

//42.Efetuar a leitura de 3 valores inteiros e exibir na tela o menor e o maior deles.

import java.util.Scanner;		

public class Exercicio_42 {

	public static void main(String[] args) {
		int A, B, C;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		A = teclado.nextInt();
		System.out.println("Digite o segundo valor");
		B = teclado.nextInt();
		System.out.println("Digite o terceiro valor");
		C = teclado.nextInt();
		
		if((A > B) && (A > C)) {
			System.out.println("O maior valor: " + A);
		}else if((B > A) && (B > C)){
			System.out.println("O maior valor: " + B);
		}else {
			System.out.println("O maior valor: " + C);
		}
		
		if((A < B) && (A < C)) {
			System.out.println("O menor valor: " + A);
		}else if((B < A) && (B < C)){
			System.out.println("O menor valor: " + B);
		}else {
			System.out.println("O menor valor: " + C);
		}		
		
		
	teclado.close();
	
	}
}
