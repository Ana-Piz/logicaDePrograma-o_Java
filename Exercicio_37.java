package logica_programacao_lista5;

/*37.Dado um n�mero de 1 at� 12, apresentar o n�mero de dias do m�s correspondente. Se o n�mero 
 * escolhido for 2 (fevereiro), considere 28 dias.
 */

import java.util.Scanner;

public class Exercicio_37 {

	public static void main(String[] args) {
		int mes;		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero de 1 at� 12 para saber quantos dias tem o m�s correspondente");
		mes = teclado.nextInt();
		
		switch(mes) {
		case 1:
			System.out.println("O m�s correpondente � Janeiro e possui 31 dias.");
			break;
		case 2:
			System.out.println("O m�s correpondente � Fevereiro e possui 28 dias.");
			break;
		case 3:
			System.out.println("O m�s correpondente � Mar�o e possui 31 dias.");
			break;
		case 4:
			System.out.println("O m�s correpondente � Abril e possui 30 dias.");
			break;
		case 5:
			System.out.println("O m�s correpondente � Maio e possui 31 dias.");
			break;
		case 6:
			System.out.println("O m�s correpondente � Junho e possui 30 dias.");
			break;
		case 7:
			System.out.println("O m�s correpondente � Julho e possui 31 dias.");
			break;
		case 8:
			System.out.println("O m�s correpondente � Agosto e possui 31 dias.");
			break;
		case 9:
			System.out.println("O m�s correpondente � Setembro e possui 30 dias.");
			break;
		case 10:
			System.out.println("O m�s correpondente � Outubro e possui 31 dias.");
			break;
		case 11:
			System.out.println("O m�s correpondente � Novembro e possui 30 dias.");
			break;
		case 12:
			System.out.println("O m�s correpondente � Dezembro e possui 31 dias.");
			break;	
		default:
			System.out.println("Digite um n�mero v�lido (1 at� 12).");
		}
		
		teclado.close();
	}

}
