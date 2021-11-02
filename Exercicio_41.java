package logica_programacao_lista5;

//41.Efetuar a leitura de três valores (variáveis A, B e C) e apresentar o maior deles.

import java.util.Scanner;

public class Exercicio_41 {

	public static void main(String[] args) {
		int A, B, C;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		A = teclado.nextInt();
		System.out.println("Digite o segundo valor");
		B = teclado.nextInt();
		System.out.println("Digite o terceiro valor");
		C = teclado.nextInt();
		
		if((A > B) && (A > C)) {
			System.out.println("O maior valor: " + A);
		}else if((B > A) && (B > C)){
			System.out.println("O maior valor: " + B);
		}else {
			System.out.println("O maior valor: " + C);
		}
		
		teclado.close();
	}

}
