package logica_programacao_lista5;

/*45.O programa abaixo possui erros de sintaxe e l�gica. Erros de sintaxe s�o aqueles relativos �s regras do VisualG. J� os erros de
 * l�gica indicam um funcionamento inesperado do algoritmo. Analise o programa abaixo e indique atrav�s de coment�rios esses erros.
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
			System.out.println("Os n�meros s�o iguais");
		}else if (A > B){
			System.out.println(A + " � menor que " + B);
		}else {
			System.out.println(B + " � menor que " + A);
		}
				
	teclado.close();

	}

}
