package logica_programacao_lista4;

/*Ler uma temperatura em graus Celsius e apresent�-la convertida em graus Fahrenheit.
 *  A f�rmula de convers�o �: F (9* C + 160) / 5. Onde F � a temperatura em Fahrenheit 
 *  e C � a temperatura em Celsius.
*/	

import java.util.Scanner;

public class Exercicio_02 {
	
	public static void main(String[] args) {
		float celsius, fahrenheit;		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		celsius = teclado.nextFloat();	
		
		fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println("Temperatura em Fahrenheit: " + fahrenheit + "�.");

		teclado.close();
	}

}
