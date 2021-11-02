package logica_programacao_lista5;

//36.Dado um caractere qualquer, verificar se ele é uma vogal.

import java.util.Scanner;

public class Exercicio_36 {

	public static void main(String[] args) {
		String letra;		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma letra do alfabeto para saber se ela é uma vogal");
		letra = teclado.nextLine();
		
		if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("A letra, " + letra + ", digitada é uma vogal.");
		}else {
			System.out.println("A letra, " + letra + ", digitada não é uma vogal.");
		}
		
		teclado.close();
	}

}
