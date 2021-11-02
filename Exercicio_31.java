package logica_programacao_lista5;

/*31.Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando como
 *  saída uma das seguintes mensagens: "Ilmo. Sr.", para o sexo informado como masculino ou a 
 *  mensagem "Ilma. Sra. ", para o sexo informado como feminino. Apresente também abaixo da 
 *  mensagem impressa o nome da pessoa.
 */

import java.util.Scanner;

public class Exercicio_31 {

	public static void main(String[] args) {
		String nome, sexo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = teclado.nextLine();		
		System.out.println("Digite seu sexo Masculino ou Feminino: ");
		sexo = teclado.nextLine();	
		
		if(sexo.equalsIgnoreCase("Masculino")){
			System.out.println("Ilmo. Sr.");
			System.out.println(nome);
		}else if (sexo.equalsIgnoreCase("Feminino")){
			System.out.println("Ilma. Sra.");
			System.out.println(nome);
		}else {
			System.out.println("Digite uma opção de sexo válida.");
		}
		
		teclado.close();

	}

}
