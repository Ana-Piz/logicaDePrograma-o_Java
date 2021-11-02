package logica_programacao_lista4;

//Através de teste de mesa indique a finalidade do algoritmo abaixo

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {
		float X, Y;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor para X: ");
		X = teclado.nextFloat();
		System.out.println("Digite um valor para Y: ");
		Y = teclado.nextFloat();
		
		System.out.println((X * Y) + " = " + (Y * X));
		//Finalidade: Ordem dos fatores não alterou o produto
		
		teclado.close();
	}

}