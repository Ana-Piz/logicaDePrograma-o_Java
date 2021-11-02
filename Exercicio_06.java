package logica_programacao_lista4;

/*
 * Alterar o programa do exercício anterior de modo que ele possa ser usado em veículos com 
 * padrão de consumo diferente de 12 Km por litro.
 */

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		float tempoGasto, velocidadeMedia, distancia, litros_usados, litros;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o consumo de km por litro do Veículo: ");
		litros = teclado.nextFloat();
		System.out.println("Digite o tempo gasto em minutos na viagem: ");
		tempoGasto = teclado.nextFloat();
		System.out.println("Digite a velocidade média: ");
		velocidadeMedia = teclado.nextFloat();
		
		distancia = (tempoGasto/60) * velocidadeMedia;
		litros_usados = distancia / litros;
		
		System.out.println("Velocidade média: " + velocidadeMedia);
		System.out.println("Tempo gasto de viagem: " + tempoGasto);
		System.out.println("Distancia percorrida: " + distancia);
		System.out.println("Quantidade de litros utilizados: " + litros_usados);	
		
		teclado.close();

	}

}
