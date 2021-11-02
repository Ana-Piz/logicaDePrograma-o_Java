package logica_programacao_lista4;

/* Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a 
 * fórmula: VOLUME = 3,14159 x R*R x ALTURA.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		double volume, r, altura;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("Digite o raio: ");
		r = teclado.nextDouble();
		System.out.println("Digite a altura: ");
		altura = teclado.nextDouble();
		
		volume = 3.14159 * (r * r) * altura;
		
		System.out.println("Resultado do volume da lata: " + formatador.format(volume));	
		
		teclado.close();

	}

}
