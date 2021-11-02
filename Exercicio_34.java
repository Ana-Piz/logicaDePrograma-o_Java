package logica_programacao_lista5;

//34.Ler um valor e escrever se é positivo, negativo ou zero

import java.util.Scanner;

public class Exercicio_34 {

	public static void main(String[] args) {
		int valor;		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor e saiba se ele é positivo ou negativo:");
		valor = teclado.nextInt();
		
		if(valor < 0) {
			System.out.println(valor + " é um valor é negativo.");
		}else if (valor > 0){
			System.out.println(valor + " é um valor é positivo.");
		}else {
			System.out.println("Valor é 0.");
		}
		
		teclado.close();
	}

}
