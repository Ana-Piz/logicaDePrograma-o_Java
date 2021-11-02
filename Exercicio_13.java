package logica_programacao_lista4;

/*Elaborar um programa que efetue a apresentação do valor da conversão em dólar (US$) de um valor
 * lido em real (R$). O programa deverá solicitar o valor da cotação do dólar e, também, a 
 * quantidade de reais disponível com o usuário.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		double valorDolar, valorReal;
		float cotacaoDolar;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("Digite a cotação para o Dolar hoje: ");
		cotacaoDolar = teclado.nextFloat();
		System.out.println("Digite o valor em Reais para a conversão em Dolar: R$");
		valorReal = teclado.nextDouble();
		
		valorDolar = valorReal / cotacaoDolar;
		
		System.out.println("Valor em Real: R$ " + valorReal);
		System.out.println("Valor convertido em Dolar: U$ " + formatador.format(valorDolar));
		
		teclado.close();
	}

}