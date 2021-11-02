package logica_programacao_lista5;

/*37.Dado um número de 1 até 12, apresentar o número de dias do mês correspondente. Se o número 
 * escolhido for 2 (fevereiro), considere 28 dias.
 */

import java.util.Scanner;

public class Exercicio_37 {

	public static void main(String[] args) {
		int mes;		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 até 12 para saber quantos dias tem o mês correspondente");
		mes = teclado.nextInt();
		
		switch(mes) {
		case 1:
			System.out.println("O mês correpondente é Janeiro e possui 31 dias.");
			break;
		case 2:
			System.out.println("O mês correpondente é Fevereiro e possui 28 dias.");
			break;
		case 3:
			System.out.println("O mês correpondente é Março e possui 31 dias.");
			break;
		case 4:
			System.out.println("O mês correpondente é Abril e possui 30 dias.");
			break;
		case 5:
			System.out.println("O mês correpondente é Maio e possui 31 dias.");
			break;
		case 6:
			System.out.println("O mês correpondente é Junho e possui 30 dias.");
			break;
		case 7:
			System.out.println("O mês correpondente é Julho e possui 31 dias.");
			break;
		case 8:
			System.out.println("O mês correpondente é Agosto e possui 31 dias.");
			break;
		case 9:
			System.out.println("O mês correpondente é Setembro e possui 30 dias.");
			break;
		case 10:
			System.out.println("O mês correpondente é Outubro e possui 31 dias.");
			break;
		case 11:
			System.out.println("O mês correpondente é Novembro e possui 30 dias.");
			break;
		case 12:
			System.out.println("O mês correpondente é Dezembro e possui 31 dias.");
			break;	
		default:
			System.out.println("Digite um número válido (1 até 12).");
		}
		
		teclado.close();
	}

}
