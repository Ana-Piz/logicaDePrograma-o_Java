package logica_programacao_lista5;

//34.Ler um valor e escrever se � positivo, negativo ou zero

import java.util.Scanner;

public class Exercicio_34 {

	public static void main(String[] args) {
		int valor;		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor e saiba se ele � positivo ou negativo:");
		valor = teclado.nextInt();
		
		if(valor < 0) {
			System.out.println(valor + " � um valor � negativo.");
		}else if (valor > 0){
			System.out.println(valor + " � um valor � positivo.");
		}else {
			System.out.println("Valor � 0.");
		}
		
		teclado.close();
	}

}
