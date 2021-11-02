package logica_programacao_lista5;

/*23.Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem 
 * dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 5. Se o 
 * aluno não foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das 
 * mensagens o valor da média do aluno para qualquer condição.
 */

import java.util.Scanner;

public class Exercicio_23 {

	public static void main(String[] args) {
		float nota1 , nota2, nota3, nota4, media;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		nota1 = teclado.nextFloat();
		
		System.out.println("Digite a segunda nota");
		nota2 = teclado.nextFloat();
		
		System.out.println("Digite a terceira nota");
		nota3 = teclado.nextFloat();
		
		System.out.println("Digite a quarta nota");
		nota4 = teclado.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4f;
		
		if (media >= 5){
			System.out.println("Aluno aprovado! Média: " + media);
		}else {
			System.out.println("Aluno reprovado! Média: " + media);
		}
		
		teclado.close();
	}

}
