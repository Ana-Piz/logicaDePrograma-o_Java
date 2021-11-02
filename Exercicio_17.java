package logica_programacao_lista4;

//Indique os erros no pseudocódigo abaixo

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {
		int X, Y, MED;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor para X: ");
		X = teclado.nextInt();
		System.out.println("Digite um valor para Y: ");
		Y = teclado.nextInt();
		
		MED = (X + Y) / 2;
		
		System.out.println("Resultado da media: " + MED);
		
		teclado.close();
	}

}
