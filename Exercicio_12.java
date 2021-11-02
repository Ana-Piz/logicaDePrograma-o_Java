package logica_programacao_lista4;

/*Elaborar um programa que efetue a apresenta��o do valor da convers�o em real (R$) de um valor 
 * lido em d�lar (US$). O programa dever� solicitar o valor da cota��o do d�lar e, tamb�m, 
 * a quantidade de d�lares dispon�vel com o usu�rio.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		double valorDolar, valorReal;
		float cotacaoDolar;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("Digite a cota��o para o Dolar hoje: ");
		cotacaoDolar = teclado.nextFloat();
		System.out.println("Digite o valor em Dolares para a convers�o em Real: U$");
		valorDolar = teclado.nextDouble();
		
		valorReal = valorDolar * cotacaoDolar;
		
		System.out.println("Valor em Dolar: U$ " + valorDolar);
		System.out.println("Valor convertido em Real: R$ " + formatador.format(valorReal));		
		
		teclado.close();
	}

}
