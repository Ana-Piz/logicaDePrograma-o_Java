package logica_programacao_lista5;

/*35.Fa�a um algoritmo para ler um nome de usu�rio (user name) e uma senha. Caso correspondam 
 *aos dados armazenados internamente no programa atrav�s do uso de constantes (�chumbado�), deve 
 *ser apresentada a mensagem �Acesso permitido�. Caso o usu�rio/senha n�o coincidam, exibir a 
 *mensagem �Usu�rio ou senha inv�lido�. A verifica��o da senha s� dever� ocorrer caso o usu�rio 
 *coincida, por�m o usu�rio n�o deve saber especificamente se foi o nome de usu�rio ou a senha 
 *que n�o coincidiu.
 */

import java.util.Scanner;

public class Exercicio_35 {

	public static final String NAME = "ANA";
	public static final String PASSWORD = "ANA2021";
		public static void main(String[] args) {
			String nome, senha;		
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Digite seu nome de usu�rio:");
			nome = teclado.nextLine();
			System.out.println("Digite sua senha:");
			senha = teclado.nextLine();
			
			if(nome.equals(NAME) && senha.equals(PASSWORD)) {
				System.out.println("Acesso permitido.");
			}else {
				System.out.println("Usu�rio ou senha inv�lido.");
			}
	
		teclado.close();	
	}

}
