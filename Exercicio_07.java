package logica_programacao_lista4;

import java.text.DecimalFormat;

/*Efetuar o c�lculo e a apresenta��o do valor de uma presta��o em atraso, utilizando a f�rmula, 
 * PRESTA��O = VALOR + (VALOR x (TAXA / 100) x TEMPO).
 */

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		double valor, prestacao;
		float taxa, tempoPrest;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("Digite o valor do t�tulo: ");
		valor = teclado.nextDouble();
		System.out.println("Digite a porcentagem da taxa: ");
		taxa = teclado.nextFloat();
		System.out.println("Digite a os dias em atraso: ");
		tempoPrest = teclado.nextFloat();
		
		prestacao = valor + (valor * (taxa / 100) * tempoPrest);
		
		System.out.println("Resultado: R$ "  + formatador.format(prestacao));
		
		teclado.close();
	}

}
