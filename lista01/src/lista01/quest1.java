package lista01;

import java.util.Scanner;

public class quest1 {
	
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite um número inteiro: ");
		valor = a.nextInt();
		
		if (valor > 10) {
			System.out.println("É maior que 10!!");
		}else {
			System.out.println("Não é maior que 10!!");
		}
		
			
				
			
		
		a.close();
	}

}
