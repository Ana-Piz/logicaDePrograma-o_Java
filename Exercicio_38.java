package logica_programacao_lista5;

/*38.Dados um caractere qualquer, verificar e informar se ele é uma vogal, um dígito numérico 
 * ou um símbolo.
 */

import java.util.Scanner;

public class Exercicio_38 {

	public static void main(String[] args) {
		String caractereQualquer;		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um caracter qualquer e saiba se é vogal, numero ou símbolo:");
		caractereQualquer = teclado.nextLine();
		
		switch(caractereQualquer) {
		case "1":
			System.out.println("O caractere digitado, " + caractereQualquer + ", é um número.");
			break;
		case "2":
			System.out.println("O caractere digitado, " + caractereQualquer + ", é um número.");
			break;
		case "3":
			System.out.println("O caractere digitado, " + caractereQualquer + ", é um número.");
			break;
		case "4":
			System.out.println("O caractere digitado, " + caractereQualquer + ", é um número.");
			break;
		case "5":
			System.out.println("O caractere digitado, " + caractereQualquer + ", é um número.");
			break;
		case "6":
			System.out.println("O caractere digitado, " + caractereQualquer + ", é um número.");
			break;
		case "7":
			System.out.println("O caractere digitado, " + caractereQualquer + ", é um número.");
			break;
		case "8":
			System.out.println("O caractere digitado, " + caractereQualquer + ", é um número.");
			break;
		case "9":
			System.out.println("O caractere digitado, " + caractereQualquer + ", é um número.");
			break;
		case "0":
			System.out.println("O caractere digitado, " + caractereQualquer + ", é um número.");
			break;
		case "a":	
		case "A":
			System.out.println("O caractere digitado, " + caractereQualquer + ", é uma vogal.");
			break;
		case "e":	
		case "E":
			System.out.println("O caractere digitado, " + caractereQualquer + ", é uma vogal.");
			break;
		case "i":	
		case "I":
			System.out.println("O caractere digitado, " + caractereQualquer + ", é uma vogal.");
			break;
		case "o":	
		case "O":
			System.out.println("O caractere digitado, " + caractereQualquer + ", é uma vogal.");
			break;
		case "u":	
		case "U":
			System.out.println("O caractere digitado, " + caractereQualquer + ", é uma vogal.");
			break;	
		default:
			System.out.println("O caractere digitado, " + caractereQualquer + ", é um símbolo.");
		}
		
		teclado.close();
	}

}
