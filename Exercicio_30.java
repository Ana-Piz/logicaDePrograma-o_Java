package logica_programacao_lista5;

/*30.Elaborar um programa que efetue a leitura de um valor que esteja entre a faixa de 1 a 9. 
 * Após a leitura do valor fornecido pelo usuário, o programa deverá indicar uma de duas 
 * mensagens: "O valor está na faixa permitida", caso o usuário forneça o valor nesta faixa ou a
 * mensagem "O valor está fora da faixa permitida", caso o usuário forneça valores menores que 1,
 * ou maiores que 9.
 */

import java.util.Scanner;

public class Exercicio_30 {

	public static void main(String[] args) {
		int a;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor na faixa de 1 a 9: ");
		a = teclado.nextInt();
		
		if (a >= 1 && a <= 9) {
			System.out.println("O valor está na faixa permitida.");
		}else {
			System.out.println( "O valor está fora da faixa permitida.");
		}
		
		teclado.close();
	}

}
