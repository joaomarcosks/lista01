package lista01;

import java.util.Scanner;

public class quest2 {

	public static void main(String[] args) {
		
		Scanner b  = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite um numero inteiro positivo ou negativo: ");
		valor = b.nextInt();
		
		if(valor >= 0) {
			System.out.println("Positivo!");
		
		}else {
			System.out.println("Negativo!");
		}
		
		b.close();

	}

}
