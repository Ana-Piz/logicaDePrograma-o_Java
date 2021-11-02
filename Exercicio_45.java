package logica_programacao_lista5;

/*45.O programa abaixo possui erros de sintaxe e lógica. Erros de sintaxe são aqueles relativos às regras do VisualG. Já os erros de
 * lógica indicam um funcionamento inesperado do algoritmo. Analise o programa abaixo e indique através de comentários esses erros.
 */

import java.util.Scanner;	

public class Exercicio_45 {

	public static void main(String[] args) {
		int A, B;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		A = teclado.nextInt();
		System.out.println("Digite o segundo valor");
		B = teclado.nextInt();
		
		if(A == B) {
			System.out.println("Os números são iguais");
		}else if (A > B){
			System.out.println(A + " É menor que " + B);
		}else {
			System.out.println(B + " É menor que " + A);
		}
				
	teclado.close();

	}

}
