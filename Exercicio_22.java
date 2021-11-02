package logica_programacao_lista5;

/*22.Ler dois valores numéricos e apresentar a diferença do maior pelo menor. Usar apenas o 
 * desvio condicional simples. Não poderá utilizar o “senão”. 
 */

import java.util.Scanner;

public class Exercicio_22 {

	public static void main(String[] args) {
		double valor1 , valor2, resultado = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primneiro valor");
		valor1 = teclado.nextDouble();
		
		System.out.println("Digite o segundo valor");
		valor2 = teclado.nextDouble();
		
		if(valor1 > valor2) {
			resultado = valor1 - valor2;
		}
		
		if(valor2 > valor1) {
			resultado = valor2 - valor1;
		}
		
		System.out.println("Resultado: " + resultado);
		
		teclado.close();

	}

}
