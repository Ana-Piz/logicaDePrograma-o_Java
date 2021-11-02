package logica_programacao_lista5;

/*32.Ler a hora de início e a hora de fim de um jogo de Poker (considere apenas horas inteiras, 
 * sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração
 * do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
 */

import java.util.Scanner;

public class Exercicio_32 {

	public static void main(String[] args) {
		int horaInicio, horaFim, duracao, duracaoOutroDia;
		String duracao24;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("O jogo passou de 24h? (Sim ou Não)");
		duracao24 = teclado.nextLine();
		
		if(duracao24.equalsIgnoreCase("Sim")) {
			System.out.println("Digite a hora de inicío do jogo de Poker no primeiro dia:");
			horaInicio = teclado.nextInt();
			System.out.println("Digite a hora do final do jogo de Poker no dia seguinte:");
			horaFim = teclado.nextInt();
			
			duracao = horaFim - horaInicio;
			duracaoOutroDia = duracao + 24;	
			
			System.out.println("Duração do jogo: " + duracaoOutroDia + "h.");			
		}else {		
			System.out.println("Digite a hora de inicío do jogo de Poker:");
			horaInicio = teclado.nextInt();
			System.out.println("Digite a hora do final do jogo de Poker:");
			horaFim = teclado.nextInt();	
			
			duracao = horaFim - horaInicio;		
			
			if(duracao == 0) {		
				duracao = 24;		
				System.out.println("Duração do jogo: " + duracao + "h.");			
			}else {
				System.out.println("Duração do jogo: " + duracao + "h.");
			}			
		}
		
		teclado.close();
		
	}
}
