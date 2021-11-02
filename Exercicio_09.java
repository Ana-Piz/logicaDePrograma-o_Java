package logica_programacao_lista4;

/* Ler dois valores para as vari�veis A e B, efetuar a troca dos valores de forma que a vari�vel
 * A passe a possuir o valor da vari�vel B e que a vari�vel B passe a possuir o valor da vari�vel
 * A. Apresentar os valores trocados. Os valores devem ser efetivamente trocados nas respectivas
 * vari�veis. 
 */

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		int a, b, troca;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor para A: ");
		a = teclado.nextInt();
		System.out.println("Digite um valor para B: ");
		b = teclado.nextInt();
		
		troca = a;
		a = b;
		b = troca;
		
		System.out.println("O novo valor de A: " + a);
		System.out.println("O novo valor de B: " + b);
		
		teclado.close();
	}

}
