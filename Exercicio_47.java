package logica_programacao_lista5;

/*47.Jogo Adivinha o número - parte 1: Elaborar um jogo do tipo adivinha o número. Onde deverá ser
 * sorteado um número entre 0 e 100. Em seguida solicitado que o usuário adivinhe qual foi o 
 * número sorteado. Após o “chute” do usuário apresentar uma mensagem informando se o número 
 * sorteado é maior, menor ou igual ao número “chutado”. Pesquise como gerar números aleatórios 
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
	    System.out.println("Eu sortiei um numero entre 0 a 100, você capaz de adivinhá-lo??");
	    while ((chute != numSecreto) && (tentativas != 19)) {	                 
	    	do { 
	        System.out.println("Digite seu chute: ");
	        chute = teclado.nextInt();	
	        tentativas++;	 
	        if ((chute > 0) || (chute < 100)) {
	        	if(chute > numSecreto) {
	        		System.out.println("Você errou, tente um número menor!");
	            }else if (chute < numSecreto){
	            	System.out.println("Você errou, tente um número maior!");
	            }else {
	            	System.out.println("Parabéns! Você acertou!");
	            	break;
	            }	  
	        }
	        if ((chute < 0) || (chute > 100)){	            	
	        	System.out.println("Valor inválido. Escolha um número de 0 a 100!");		            	
	        }	    
	        System.out.println("Tentativas: " + tentativas);
	        }while ((chute >= 0) && (chute <= 100));	       
	   	     
	    }
	      	if (tentativas <= 5) {
	      		System.out.println("Você é muito bom, acertou em " + tentativas + " tentativas.");
	      	}else if (tentativas <= 9){
	      		System.out.println("Você é bom, acertou em " + tentativas + " tentativas.");
	      	}else if (tentativas <= 13){
	      		System.out.println("Você é mediano, acertou em " + tentativas + " tentativas.");
	      	}else if (tentativas <= 19){
	      		System.out.println("Você é fraco, acertou em " + tentativas + " tentativas");
	      	}else {
	      		System.out.println("Você estourou o número de tentativas!");
	      	}
			
		System.out.println("Obrigada por jogar! =)");
	   
		teclado.close();	
	}

}
