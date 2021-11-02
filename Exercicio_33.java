package logica_programacao_lista5;

/*33.A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar 
 * mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo 
 * de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por 
 * hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso
 *  tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
 */

import java.util.Scanner;

public class Exercicio_33 {

	public static void main(String[] args) {
		double horasTrabMes, horasExtas, salarioHora, salarioTotal;		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite quantas horas foram trabalhadas no mes:");
		horasTrabMes = teclado.nextDouble();
		System.out.println("Digite o salário por hora:");
		salarioHora = teclado.nextDouble();
		
		if(horasTrabMes > 40) {
			horasExtas = horasTrabMes - 40;				
			salarioTotal = ((salarioHora * 40) * 4) + (((salarioHora * 0.5) + salarioHora) * horasExtas);
			System.out.println("Salário toral com horas extas: R$ " + salarioTotal);
		}else {
			salarioTotal = (salarioHora * 40) * 4;
			System.out.println("Salário total: R$ " + salarioTotal);
		}
		
		teclado.close();
	}

}
