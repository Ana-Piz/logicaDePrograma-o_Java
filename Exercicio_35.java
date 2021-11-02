package logica_programacao_lista5;

/*35.Faça um algoritmo para ler um nome de usuário (user name) e uma senha. Caso correspondam 
 *aos dados armazenados internamente no programa através do uso de constantes (“chumbado”), deve 
 *ser apresentada a mensagem “Acesso permitido”. Caso o usuário/senha não coincidam, exibir a 
 *mensagem “Usuário ou senha inválido”. A verificação da senha só deverá ocorrer caso o usuário 
 *coincida, porém o usuário não deve saber especificamente se foi o nome de usuário ou a senha 
 *que não coincidiu.
 */

import java.util.Scanner;

public class Exercicio_35 {

	public static final String NAME = "ANA";
	public static final String PASSWORD = "ANA2021";
		public static void main(String[] args) {
			String nome, senha;		
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Digite seu nome de usuário:");
			nome = teclado.nextLine();
			System.out.println("Digite sua senha:");
			senha = teclado.nextLine();
			
			if(nome.equals(NAME) && senha.equals(PASSWORD)) {
				System.out.println("Acesso permitido.");
			}else {
				System.out.println("Usuário ou senha inválido.");
			}
	
		teclado.close();	
	}

}
