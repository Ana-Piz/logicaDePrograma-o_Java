package logica_programacao_lista5;

/*28.Efetuar a leitura de quatro n�meros inteiros e apresentar os n�meros que s�o divis�veis 
 * por 2 e 3. 
 */

import java.util.Scanner;

public class Exercicio_28 {

	public static void main(String[] args) {
		int a, b, c, d;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		a = teclado.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = teclado.nextInt();
		System.out.println("Digite o terceiro valor: ");
		c = teclado.nextInt();
		System.out.println("Digite o quarto valor: ");
		d = teclado.nextInt();		
		
	
		if (a % 2 == 0 && a % 3 == 0){
			System.out.println(a + " � divis�vel por 2 e por 3.");
			System.out.println("Divis�o de " + a + " por 2: " + a / 2);
			System.out.println("Divis�o de " + a + " por 2: " + a / 3 + "\r\n");
		}
		if (b % 2 == 0 && b % 3 == 0){
			System.out.println(b + " � divis�vel por 2 e por 3.");
			System.out.println("Divis�o de " + b + " por 2: " + b / 2);
			System.out.println("Divis�o de " + b + " por 2: " + b / 3 + "\r\n");
		}
		if (c % 2 == 0 && c % 3 == 0){
			System.out.println(c + " � divis�vel por 2 e por 3.");
			System.out.println("Divis�o de " + c + " por 2: " + c / 2);
			System.out.println("Divis�o de " + c + " por 2: " + c / 3 + "\r\n");
		}
		if (d % 2 == 0 && d % 3 == 0){
			System.out.println(d + " � divis�vel por 2 e por 3.");	
			System.out.println("Divis�o de " + d + " por 2: " + d / 2);
			System.out.println("Divis�o de " + d + " por 2: " + d / 3  + "\r\n");
		}
		
		teclado.close();
	}

}
