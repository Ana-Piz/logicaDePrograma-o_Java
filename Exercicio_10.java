package logica_programacao_lista4;

//Efetuar a leitura de um número inteiro e apresentar o resultado do quadrado deste número.

import java.util.Scanner; 

public class Exercicio_10 {

	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor para saber o seu quadrado: ");
		numero = teclado.nextInt();
		
		System.out.println("O quadrado de " + numero + " = " + (numero * numero));		
		
		teclado.close();
	}

}
