package logica_programacao_lista4;

/*Fazer um programa que apresente o m�dulo de um valor informado pelo usu�rio. O m�dulo � o 
 * n�mero sempre positivo. Exemplo | 5 | = 5 e | -5 | = 5 (m�dulo de 5 igual a cinco e m�dulo de 
 * -5 igual a cinco tamb�m.
*/

import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {
		int X, result;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor para X: ");
		X = teclado.nextInt();
		
		result = Math.abs(X);
		
		System.out.println("Resultado: " + result);
		
		teclado.close();
	}

}
