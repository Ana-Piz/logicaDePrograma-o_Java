package logica_programacao_lista5;

/*27.Elaborar um programa que calcule as raízes reais de uma equação de 2º grau, informados os 
 * valores do coeficiente de x2 (a), do coeficiente de x (b) e do elemento neutro (c).
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_27 {

	public static void main(String[] args) {
		double a, b, c, delta, x1 = 0, x2 = 0;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00"); 
		
		System.out.println("Digite um valor para para A");
		a = teclado.nextDouble();

		System.out.println("Digite um valor para para B");
		b = teclado.nextDouble();
		
		System.out.println("Digite um valor para para C");
		c = teclado.nextDouble();
		
		delta = (b * b) - (4 * a * c);
		
		if (delta == 0) {
			System.out.println("Não possui raiz real.");
		}else {
			x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
			x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
			System.out.println("Valor de x1: " + formatador.format(x1));
			System.out.println("Valor de x2: " + formatador.format(x2));
		}		
				
		teclado.close();
	}

}
