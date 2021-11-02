package logica_programacao_lista5;

/*39.Dada uma data informada pelo usuário indicar ordinalmente o dia do ano que ela representa 
 * do 1º dia ao 365º/366º (conforme o ano for ou não bissexto). O usuário informará separadamente
 *  dos valores do dia,do mês e do ano pesquisado.
 */

import java.util.Scanner;

public class Exercicio_39 {

	public static void main(String[] args) {
		int dia, mes, mesTot, ano;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o dia: ");
		dia = teclado.nextInt();
		System.out.println("Digite o mes: ");
		mes = teclado.nextInt();
		System.out.println("Digite o ano: ");
		ano = teclado.nextInt();
		
		if(dia <= 31 && mes <= 12 && mes >= 1) {		
		
			if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0 )){		
				switch(mes) {			
				case 1:						
					System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
					System.out.println("Corresponde ao: " + dia + "º dia do ano.");					
					break;		
				case 2:
					if(dia <= 29) {
						mesTot = 31 + dia;		
						System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
						System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					}else {
						System.out.println("Data inválida para o mês.");
					}
					break;
				case 3:
					mesTot = 60 + dia;		
					System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
					System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					break;
				case 4:
					if(dia <= 30) {
						mesTot = 91 + dia;		
						System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
						System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					}else {
						System.out.println("Data inválida para o mês.");
					}
					break;
				case 5:
					mesTot = 121 + dia;		
					System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
					System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					break;
				case 6:
					if(dia <= 30) {
						mesTot = 152 + dia;		
						System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
						System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					}else {
						System.out.println("Data inválida para o mês.");
					}
					break;
				case 7:
					mesTot = 182 + dia;		
					System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
					System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					break;
				case 8:
					mesTot = 213 + dia;		
					System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
					System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					break;
				case 9:
					if(dia <= 30) {
						mesTot = 244 + dia;		
						System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
						System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					}else {
						System.out.println("Data inválida para o mês.");
					}
					break;
				case 10:
					mesTot = 274 + dia;		
					System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
					System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					break;
				case 11:
					if(dia <= 30) {
						mesTot = 305 + dia;		
						System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
						System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					}else {
						System.out.println("Data inválida para o mês.");
					}
					break;
				case 12:
					mesTot = 335 + dia;		
					System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
					System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					break;	
				default:
					System.out.println("Data inválida.");
					}
			}else {
				switch(mes) {
				case 1:				
					System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
					System.out.println("Corresponde ao: " + dia + "º dia do ano.");
					break;
				case 2:
					if(dia <= 28) {
						mesTot = 31 + dia;		
						System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
						System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					}else {
						System.out.println("Data inválida para o mês.");
					}
					break;
				case 3:
					mesTot = 59 + dia;		
					System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
					System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					break;
				case 4:
					if(dia <= 30) {
						mesTot = 90 + dia;		
						System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
						System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					}else {
						System.out.println("Data inválida para o mês.");
					}
					break;
				case 5:
					mesTot = 120 + dia;		
					System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
					System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					break;
				case 6:
					if(dia <= 30) {
						mesTot = 151 + dia;		
						System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
						System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					}else {
						System.out.println("Data inválida para o mês.");
					}
					break;
				case 7:
					mesTot = 181 + dia;		
					System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
					System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					break;
				case 8:
					mesTot = 212 + dia;		
					System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
					System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					break;
				case 9:
					if(dia <= 30) {
						mesTot = 243 + dia;		
						System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
						System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					}else {
						System.out.println("Data inválida para o mês.");
					}
					break;
				case 10:
					mesTot = 273 + dia;		
					System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
					System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					break;
				case 11:
					if(dia <= 30) {
						mesTot = 304 + dia;		
						System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
						System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					}else {
						System.out.println("Data inválida para o mês.");
					}
					break;
				case 12:
					mesTot = 334 + dia;		
					System.out.println("Data digitada: " + dia + "/" + mes + "/" + ano);
					System.out.println("Corresponde ao: " + mesTot + "º dia do ano.");
					break;	
				default:
					System.out.println("Data inválida.");
					}			
			}
		}else {
			System.out.println("Data inválida.");
		}
		teclado.close();
	}

}
