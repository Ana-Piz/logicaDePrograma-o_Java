package logica_programacao_lista5;

/*40.Ler três valores para os lados de um triângulo, considerando lados como: A, B e C. Verificar
 * se os lados fornecidos formam realmente um triângulo (teste de verificação), e se for esta
 * condição verdadeira, deverá ser indicado qual tipo de triângulo foi formado: isósceles, 
 * escaleno ou equilátero. Dica: para saber se um conjunto de três segmentos de reta formas um 
 * triângulo basta verificar que cada a medida de cada um dos segmentos (lados) seja menor do que
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
				System.out.println("E é um triangulo isósceles.");
			}else if ((A == B) && (A == C) && (B == C)) {
				System.out.println("E é um triangulo equilátero.");
			}else if ((A != B) && (A != C) && (B != C)) {
				System.out.println("E é um triangulo escaleno.");
			}
		}else { 
			System.out.println("Não forma um triangulo.");	
		}	
				
	teclado.close();

	}

}
