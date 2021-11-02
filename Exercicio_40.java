package logica_programacao_lista5;

/*40.Ler tr�s valores para os lados de um tri�ngulo, considerando lados como: A, B e C. Verificar
 * se os lados fornecidos formam realmente um tri�ngulo (teste de verifica��o), e se for esta
 * condi��o verdadeira, dever� ser indicado qual tipo de tri�ngulo foi formado: is�sceles, 
 * escaleno ou equil�tero. Dica: para saber se um conjunto de tr�s segmentos de reta formas um 
 * tri�ngulo basta verificar que cada a medida de cada um dos segmentos (lados) seja menor do que
 *  a soma dos outros dois.
 */

import java.util.Scanner;

public class Exercicio_40 {

	public static void main(String[] args) {
		int A = 0, B = 0, C = 0;		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro lado do triangulo:");
		A = teclado.nextInt();
		System.out.println("Digite o valor do segundo lado do triangulo:");
		B = teclado.nextInt();
		System.out.println("Digite o valor do terceiro lado do triangulo:");
		C = teclado.nextInt();
			
		if((A < C + B) && (B < C + A) && (C < A + B)) {
			System.out.println("Forma um triangulo.");
			if((A == B && C != A) || (C == B && A != B) || (A == C && B != C) ){
				System.out.println("E � um triangulo is�sceles.");
			}else if ((A == B) && (A == C) && (B == C)) {
				System.out.println("E � um triangulo equil�tero.");
			}else if ((A != B) && (A != C) && (B != C)) {
				System.out.println("E � um triangulo escaleno.");
			}
		}else { 
			System.out.println("N�o forma um triangulo.");	
		}	
				
	teclado.close();

	}

}
