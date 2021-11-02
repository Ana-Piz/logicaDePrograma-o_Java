package logica_programacao_lista4;

import java.util.Scanner;

/*
 * Efetuar o cálculo da quantidade de litros de combustível gastos em uma viagem, utilizando-se 
 * um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deverá fornecer o tempo 
 * gasto na viagem e a velocidade média durante a mesma. Desta forma, será possível obter a 
 * distância percorrida com a fórmula DISTÂNCIA = TEMPO x VELOCIDADE. Tendo o valor da distância, 
 * basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula: 
 * LITROS_USADOS = DISTÂNCIA / 12. O programa deverá apresentar os valores da velocidade média, 
 * tempo gasto na vigem, a distância percorrida e a quantidade de litros utilizada na viagem.
 */

public class Exercicio_05 {

	public static void main(String[] args) {
		float tempoGasto, velocidadeMedia, distancia, litros_usados;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o tempo gasto em minutos na viagem: ");
		tempoGasto = teclado.nextFloat();
		System.out.println("Digite a velocidade média: ");
		velocidadeMedia = teclado.nextFloat();
		
		distancia = (tempoGasto/60) * velocidadeMedia;
		litros_usados = distancia / 12;
		
		System.out.println("Velocidade média: " + velocidadeMedia);
		System.out.println("Tempo gasto de viagem: " + tempoGasto);
		System.out.println("Distancia percorrida: " + distancia);
		System.out.println("Quantidade de litros utilizados: " + litros_usados);	
		
		teclado.close();

	}

}
