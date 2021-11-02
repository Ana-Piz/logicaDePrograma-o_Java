package logica_programacao_lista5;

/*33.A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que trabalhar 
 * mais de 40 horas receber� hora extra, cujo c�lculo � o valor da hora regular com um acr�scimo 
 * de 50%. Escreva um algoritmo que leia o n�mero de horas trabalhadas em um m�s, o sal�rio por 
 * hora e escreva o sal�rio total do funcion�rio, que dever� ser acrescido das horas extras, caso
 *  tenham sido trabalhadas (considere que o m�s possua 4 semanas exatas).
 */

import java.util.Scanner;

public class Exercicio_33 {

	public static void main(String[] args) {
		double horasTrabMes, horasExtas, salarioHora, salarioTotal;		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite quantas horas foram trabalhadas no mes:");
		horasTrabMes = teclado.nextDouble();
		System.out.println("Digite o sal�rio por hora:");
		salarioHora = teclado.nextDouble();
		
		if(horasTrabMes > 40) {
			horasExtas = horasTrabMes - 40;				
			salarioTotal = ((salarioHora * 40) * 4) + (((salarioHora * 0.5) + salarioHora) * horasExtas);
			System.out.println("Sal�rio toral com horas extas: R$ " + salarioTotal);
		}else {
			salarioTotal = (salarioHora * 40) * 4;
			System.out.println("Sal�rio total: R$ " + salarioTotal);
		}
		
		teclado.close();
	}

}
