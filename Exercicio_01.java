package logica_programacao_lista4;

//Ler dois números positivos e apresentar a soma, diferença, produto e quociente entre eles.

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		int a, b, soma, subtracao, produto, quociente;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		a = teclado.nextInt();	
		System.out.println("Digite o segundo valor: ");
		b = teclado.nextInt();	
		
		soma = a + b;
		subtracao = a - b;
		produto = a * b;
		quociente = a / b;
		
		System.out.println("-------- Resultados --------");
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Produto: " + produto);
		System.out.println("Quociente: " + quociente);
		
		teclado.close();
		
	}

}
