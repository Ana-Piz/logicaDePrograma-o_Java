package logica_programacao_lista5;

/*47.Jogo Adivinha o n�mero - parte 1: Elaborar um jogo do tipo adivinha o n�mero. Onde dever� ser
 * sorteado um n�mero entre 0 e 100. Em seguida solicitado que o usu�rio adivinhe qual foi o 
 * n�mero sorteado. Ap�s o �chute� do usu�rio apresentar uma mensagem informando se o n�mero 
 * sorteado � maior, menor ou igual ao n�mero �chutado�. Pesquise como gerar n�meros aleat�rios 
 * no VisualG.
 */

import java.util.Random;

import java.util.Scanner;	

public class Exercicio_47 {

	public static void main(String[] args) {
		int chute, tentativas;
		Random random = new Random();
		Scanner teclado = new Scanner(System.in);
		
		int numSecreto = random.nextInt(101);
		System.out.println("numero secreto = " +  numSecreto);
		  
	    chute = -1;
	    tentativas = 0;
	    System.out.println("Eu sortiei um numero entre 0 a 100, voc� capaz de adivinh�-lo??");
	    while ((chute != numSecreto) && (tentativas != 19)) {	                 
	    	do { 
	        System.out.println("Digite seu chute: ");
	        chute = teclado.nextInt();	
	        tentativas++;	 
	        if ((chute > 0) || (chute < 100)) {
	        	if(chute > numSecreto) {
	        		System.out.println("Voc� errou, tente um n�mero menor!");
	            }else if (chute < numSecreto){
	            	System.out.println("Voc� errou, tente um n�mero maior!");
	            }else {
	            	System.out.println("Parab�ns! Voc� acertou!");
	            	break;
	            }	  
	        }
	        if ((chute < 0) || (chute > 100)){	            	
	        	System.out.println("Valor inv�lido. Escolha um n�mero de 0 a 100!");		            	
	        }	    
	        System.out.println("Tentativas: " + tentativas);
	        }while ((chute >= 0) && (chute <= 100));	       
	   	     
	    }
	      	if (tentativas <= 5) {
	      		System.out.println("Voc� � muito bom, acertou em " + tentativas + " tentativas.");
	      	}else if (tentativas <= 9){
	      		System.out.println("Voc� � bom, acertou em " + tentativas + " tentativas.");
	      	}else if (tentativas <= 13){
	      		System.out.println("Voc� � mediano, acertou em " + tentativas + " tentativas.");
	      	}else if (tentativas <= 19){
	      		System.out.println("Voc� � fraco, acertou em " + tentativas + " tentativas");
	      	}else {
	      		System.out.println("Voc� estourou o n�mero de tentativas!");
	      	}
			
		System.out.println("Obrigada por jogar! =)");
	   
		teclado.close();	
	}

}
