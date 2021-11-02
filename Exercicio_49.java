package logica_programacao_lista5;

//49.Efetuar a leitura de 4 valores (variáveis A, B, C e D) e apresentar os valores dispostos em ordem crescente.

import java.util.Scanner;

public class Exercicio_49 {

	public static void main(String[] args) {
		int a , b, c, d;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		a = teclado.nextInt();
		System.out.println("Digite o segundo valor");
		b = teclado.nextInt();
		System.out.println("Digite o terceiro valor");
		c = teclado.nextInt();
		System.out.println("Digite o quarto valor");
		d = teclado.nextInt();
	
	    if ((a < b) && (a < c) && (a < d) && (b < c) &&  (c < d)) {
	    	System.out.println("A ordem crescente é: " + a + ", " + b + ", " + c + ", " + d);
	    } else if ((b < a) && (b < c) && (a < c) && (c < d)) {
	        System.out.println("A ordem crescente é: " + b + ", " + a + ", " + c + ", " + d);
	    }	      
	    
	    if ((c < b) && (c < a) && (a < b) && (b < d)) {
	        System.out.println("A ordem crescente é: " + c + ", " + a + ", " + b + ", " + d);
	    } else if ((b < a) && (b < c) && (c < a) && (a < d)) {
	        System.out.println("A ordem crescente é: " + b + ", " + c + ", " + a + ", " + d);
	    }
	    
	    if ((c < b) && (c < a) && (b < a) && (a < d)) {
	    	System.out.println("A ordem crescente é: " + c + ", " + b + ", " + a + ", " + d);
	    } else if ((a < b) && (a < c) && (c < b) && (b < d)) {
	        System.out.println("A ordem crescente é: " + a + ", " + c + ", " + b + ", " + d);
	    }
	    
	    if ((d < a) && (d < b) && (a < b) && (b < c)) {
	    	System.out.println("A ordem crescente é: " + d + ", " + a + ", " + b + ", " + c);
	    } else if ((d < b) && (d < a) && (b < a) && (a < c)) {
	    	System.out.println("A ordem crescente é: " + d + ", " + b + ", " + a + ", " + c);
	    }
	    if ((d < c) && (d < b) && (c < b) && (b < a)) {
	    	System.out.println("A ordem crescente é: " + d + ", " + c + ", " + b + ", " + a);
	    } else if ((d < c) && (d < a) && (c < a) && (a < b)) {
	    	System.out.println("A ordem crescente é: " + d + ", " + c + ", " + a + ", " + b);
	    }
	    
	    if ((b < d) && (b < a) && (d < a) && (a < c)) {
	    	System.out.println("A ordem crescente é: " + b + ", " + d + ", " + a + ", " + c);
	    } else if ((b < a) && (b < d) && (a < d) && (d < c)) {
	    	System.out.println("A ordem crescente é: " + b + ", " + a + ", " + d + ", " + c);
	    }
	    
	    if ((c < d) && (c < b) && (d < b) && (b < a)) {
	    	System.out.println("A ordem crescente é: " + c + ", " + d + ", " + b + ", " + a);
	    } else if ((c < d) && (c < a) && (d < a) && (a < b)) {
	    	System.out.println("A ordem crescente é: " + c + ", " + d + ", " + a + ", " + b);
	    }
	    
	    if ((a < d) && (a < b) && (d < b) && (b < c)) {
	    	System.out.println("A ordem crescente é: " + a + ", " + d + ", " + b + ", " + c);
	    } else if ((a < d) && (a < c) && (d < c) && (c < b)) {
	    	System.out.println("A ordem crescente é: " + a + ", " + d + ", " + c + ", " + b);
	    }
	    
	    if ((a < b) && (a < d) && (b < d) && (d < c)) {
	    	System.out.println("A ordem crescente é: " + a + ", " + b + ", " + d + ", " + c);
	    } else if ((c < a) && (c < d) && (a < d) && (d < b)) {
	    	System.out.println("A ordem crescente é: " + c + ", " + a + ", " + d + ", " + b);
	    }
	    
	    if ((c < b) && (c < d) && (b < d) && (d < a)) {
	      	System.out.println("A ordem crescente é: " + c + ", " + b + ", " + d + ", " + a);
	    } else if ((a < c) && (a < d) && (c < d) && (d < b)) {
	    	System.out.println("A ordem crescente é: " + a + ", " +  c + ", " + d + ", " + b);
	    }
	    
	    if ((d < a) && (d < c) && (a < c) && (c < b)) {
	    	System.out.println("A ordem crescente é: " + d + ", " + a + ", " + c + ", " + b);
	    } else if ((b < c) && (b < d) && (c < d) && (d < a)) {
	    	System.out.println("A ordem crescente é: " + b + ", " + c + ", " + d + ", " + a);
	    }
	    
	    if ((b < d) && (b < c) && (d < c) && (c < a)) {
	    	System.out.println("A ordem crescente é: " + b + ", " + d + ", " + c + ", " + a);
	    } else if ((d < b) && (d < c) && (b < c) && (c < a)) {
	    	System.out.println("A ordem crescente é: " + d + ", " + b + ", " + c + ", " + a);
	    }
	    
		teclado.close();	
		
	}

}
