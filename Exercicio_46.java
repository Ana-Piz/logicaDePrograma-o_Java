package logica_programacao_lista5;

//46.Através de teste de mesa, analise e indique a finalidade do algoritmo abaixo:

import java.util.Scanner;	

public class Exercicio_46 {

	public static void main(String[] args) {
		int R1, R2, AUX;		
		Scanner teclado = new Scanner(System.in);
		
		R1 = teclado.nextInt();		
		R2 = teclado.nextInt();
		
		if(R1 >= R2) {
			AUX = R1;
			R1 = R2;
			R2 = AUX;
		}
		
		System.out.println(R1 + "," + R2);
		
		teclado.close();	
	}
	
  //Resposta: A finalidade do algoritmo é trocar a ordem dos valores se o R1 for maior ou igual ao R2.
}
