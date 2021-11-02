package logica_programacao_lista4;

/* Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma que a variável
 * A passe a possuir o valor da variável B e que a variável B passe a possuir o valor da variável
 * A. Apresentar os valores trocados. Os valores devem ser efetivamente trocados nas respectivas
 * variáveis. 
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
