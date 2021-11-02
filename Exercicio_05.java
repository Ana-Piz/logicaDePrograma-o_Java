package logica_programacao_lista4;

import java.util.Scanner;

/*
 * Efetuar o c�lculo da quantidade de litros de combust�vel gastos em uma viagem, utilizando-se 
 * um autom�vel que faz 12 Km por litro. Para obter o c�lculo, o usu�rio dever� fornecer o tempo 
 * gasto na viagem e a velocidade m�dia durante a mesma. Desta forma, ser� poss�vel obter a 
 * dist�ncia percorrida com a f�rmula DIST�NCIA = TEMPO x VELOCIDADE. Tendo o valor da dist�ncia, 
 * basta calcular a quantidade de litros de combust�vel utilizada na viagem com a f�rmula: 
 * LITROS_USADOS = DIST�NCIA / 12. O programa dever� apresentar os valores da velocidade m�dia, 
 * tempo gasto na vigem, a dist�ncia percorrida e a quantidade de litros utilizada na viagem.
 */

public class Exercicio_05 {

	public static void main(String[] args) {
		float tempoGasto, velocidadeMedia, distancia, litros_usados;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o tempo gasto em minutos na viagem: ");
		tempoGasto = teclado.nextFloat();
		System.out.println("Digite a velocidade m�dia: ");
		velocidadeMedia = teclado.nextFloat();
		
		distancia = (tempoGasto/60) * velocidadeMedia;
		litros_usados = distancia / 12;
		
		System.out.println("Velocidade m�dia: " + velocidadeMedia);
		System.out.println("Tempo gasto de viagem: " + tempoGasto);
		System.out.println("Distancia percorrida: " + distancia);
		System.out.println("Quantidade de litros utilizados: " + litros_usados);	
		
		teclado.close();

	}

}
