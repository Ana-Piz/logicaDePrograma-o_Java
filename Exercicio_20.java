package logica_programacao_lista5;

/*20.Elaborar um programa que efetue a leitura de um determinado valor e apresente-o caso este
 *  não seja maior que três. 
 */

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {
		int valor;
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Digite um valor");
		valor = teclado.nextInt();

		if(valor < 3) {
			System.out.println("O valor digitado é menor que 3.");
			System.out.println("Valor digitado: " + valor);
		}
		
		teclado.close();
	}

}
