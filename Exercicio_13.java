package logica_programacao_lista4;

/*Elaborar um programa que efetue a apresenta��o do valor da convers�o em d�lar (US$) de um valor
 * lido em real (R$). O programa dever� solicitar o valor da cota��o do d�lar e, tamb�m, a 
 * quantidade de reais dispon�vel com o usu�rio.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		double valorDolar, valorReal;
		float cotacaoDolar;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("Digite a cota��o para o Dolar hoje: ");
		cotacaoDolar = teclado.nextFloat();
		System.out.println("Digite o valor em Reais para a convers�o em Dolar: R$");
		valorReal = teclado.nextDouble();
		
		valorDolar = valorReal / cotacaoDolar;
		
		System.out.println("Valor em Real: R$ " + valorReal);
		System.out.println("Valor convertido em Dolar: U$ " + formatador.format(valorDolar));
		
		teclado.close();
	}

}