package logica_programacao_lista5;

/*Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem 
 * dizendo que o aluno foi aprovado, se o valor da m�dia escolar for maior ou igual a 7. 
 * Se o valor da m�dia for menor que 7, solicitar a nota de exame, sornar com o valor da m�dia e
 * obter nova m�dia. Se a nova m�dia for maior ou igual a 5, apresentar uma mensagem dizendo que 
 * o aluno foi aprovado em exame. Se o aluno n�o foi aprovado, indicar uma mensagem informando 
 * esta condi��o. Apresentar com as mensagens o valor da m�dia do aluno, para qualquer condi��o.
 */

import java.util.Scanner;

public class Exercicio_24 {

	public static void main(String[] args) {
		float nota1 , nota2, nota3, nota4, media, notaExame = 0, novaMedia = 0;
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
		
		if (media >= 7){
			System.out.println("Aluno aprovado! Media: " + media);
		}else if (media < 7){
			System.out.println("Media: "+ media + ". - Informe a nota do Exame");
			notaExame = teclado.nextFloat();	
			novaMedia = (media + notaExame) / 2f;	
		}if (novaMedia >= 5 && media < 7){
			System.out.println("Aluno foi aprovado no exame! Media: " + novaMedia);
		}else if (novaMedia < 5  && media < 7){
			System.out.println("Aluno n�o foi aprovado no exame! Media: " + novaMedia);
		}
		
		teclado.close();
	}

}


