package estruturaCondicional;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero;
	    System.out.println("Digite o número do dia da semana: ");
	    numero = ler.nextInt();
	    
	    if (numero == 1) {
		    System.out.println("O dia da semana é Domingo ");
	    }
	    if (numero == 2) {
		    System.out.println("O dia da semana é Segunda ");
	    }
		if (numero == 3) {
			 System.out.println("O dia da semana é Terça ");
		}
	    if (numero == 4) {
		System.out.println("O dia da semana é Quarta ");
	    }
		if (numero == 5) {
			System.out.println("O dia da semana é Quinta ");
		}
		if (numero == 6) {
				System.out.println("O dia da semana é Sexta ");
		}
		if (numero == 7) {
			System.out.println("O dia da semana é Sabado ");
		}
		
		else if (numero > 7){
			System.out.println("Dia da semana inexistente");
		}
		
		else if (numero < 1) {
			System.out.println("Dia da semana inexistente");
		}
		
		ler.close();
		}
}
