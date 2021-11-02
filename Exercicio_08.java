package logica_programacao_lista4;

//Efetuar e apresentar o valor com desconto, dado o valor normal e a porcentagem de desconto.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		double valor, valorDesconto;
		float porcentagem;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("Digite o valor da compra: ");
		valor = teclado.nextDouble();
		System.out.println("Digite a porcentagem de desconto: ");
		porcentagem = teclado.nextFloat();
		
		valorDesconto = valor - (valor * (porcentagem / 100));
		
		System.out.println("O novo valor com desconto: R$ " + formatador.format(valorDesconto));
		
		teclado.close();
	}

}
