package logica_programacao_lista5;

/*21.Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o n�mero lido como 
 * sendo um valor negativo. Lembre-se de verificar se o n�mero fornecido � maior que zero, sendo 
 * multiplique-o por -1. Usar apenas o desvio condicional simples. N�o poder� utilizar o �sen�o�. 
 */

import java.util.Scanner;

public class Exercicio_21 {

	public static void main(String[] args) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro positivo ou negativo: ");
		valor = teclado.nextInt();
		
		if(valor > 0) {
			valor = valor * (-1);
		}
		
		System.out.println("Valor negativo: " + valor);
		
		teclado.close();

	}

}
