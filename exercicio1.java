package estruturaCondicional;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double a,b,c,d,som,div;
		
		System.out.println("Digite a primeira nota: ");
		a = ler.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		b = ler.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		c = ler.nextDouble();
		
		System.out.println("Digite a quarta nota nota: ");
		d = ler.nextDouble();
		
		//Processamento
		som = a+b+c+d;
		div = som/4;
		
		if (div >= 6) {
			System.out.println("você está aprovado! Sua média foi: "  + div) ;
			
}
		
		else {
			System.out.println("Você está reprovado, sua média foi: " + div);
			
			
		}
		
		ler.close();

	}

}
