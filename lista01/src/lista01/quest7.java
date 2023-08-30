package lista01;

import java.util.Scanner;

public class quest7 {

	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		double valor1;
		double valor2;
		
		System.out.println("Digite o priemeiro valor: ");
		valor1 = c.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = c.nextDouble();
		
		if(valor1 > valor2) {
			System.out.println(valor2 + "," + valor1);
		}else {
			System.out.println(valor1 + "," + valor2);
			
		}

		c.close();

	}

}
