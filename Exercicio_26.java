package logica_programacao_lista5;

/*26.Elaborar um programa que calcule a raiz real de uma equação de 1º grau, informados os 
 * valores do coeficiente de x (a) e do elemento neutro (b).
 */

import java.util.Scanner;
import java.text.DecimalFormat;


public class Exercicio_26 {

	public static void main(String[] args) {
		double a, b, x = 0;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00"); 
		
		System.out.println("Informe o coeficiente de x (a): ");
		a = teclado.nextDouble();
		System.out.println("Informe o elemento neutro (b): ");
		b = teclado.nextDouble();
		
		if (a == 0) {
			System.out.println("Não existe raiz.");
		}else {			
			x =  -b / a;
		}
		
		System.out.println("Resultado: " + formatador.format(x));
		
		teclado.close();
	}

}
