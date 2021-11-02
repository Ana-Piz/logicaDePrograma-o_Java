package logica_programacao_lista4;

import java.text.DecimalFormat;

/*
 * Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. 
 * A fórmula de conversão é: C (F - 32) * (5/9). Onde F é a temperatura em Fahrenheit 
 * e C é a temperatura em Celsius.
 */

import java.util.Scanner;

public class Exercicio_03 {
	
	public static void main(String[] args) {
		double celsius, fahrenheit;		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		fahrenheit = teclado.nextDouble();	
		
		celsius = (fahrenheit - 32) * 0.556;
		
		System.out.println("Temperatura em Celsius: " + formatador.format(celsius) + "º.");
		
		teclado.close();

	}

}
