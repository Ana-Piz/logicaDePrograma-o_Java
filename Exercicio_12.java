package logica_programacao_lista4;

/*Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor 
 * lido em dólar (US$). O programa deverá solicitar o valor da cotação do dólar e, também, 
 * a quantidade de dólares disponível com o usuário.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		double valorDolar, valorReal;
		float cotacaoDolar;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("Digite a cotação para o Dolar hoje: ");
		cotacaoDolar = teclado.nextFloat();
		System.out.println("Digite o valor em Dolares para a conversão em Real: U$");
		valorDolar = teclado.nextDouble();
		
		valorReal = valorDolar * cotacaoDolar;
		
		System.out.println("Valor em Dolar: U$ " + valorDolar);
		System.out.println("Valor convertido em Real: R$ " + formatador.format(valorReal));		
		
		teclado.close();
	}

}
