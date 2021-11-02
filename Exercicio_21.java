package logica_programacao_lista5;

/*21.Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como 
 * sendo um valor negativo. Lembre-se de verificar se o número fornecido é maior que zero, sendo 
 * multiplique-o por -1. Usar apenas o desvio condicional simples. Não poderá utilizar o “senão”. 
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
