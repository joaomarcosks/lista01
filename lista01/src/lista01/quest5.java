package lista01;

import java.util.Scanner;

public class quest5 {

	public static void main(String[] args) {
		
		Scanner v = new Scanner(System.in);
		int aa;
		int an;
		int idade;
		
		System.out.println("Digite o ano em que estamos: ");
		aa = v.nextInt();
		
		System.out.println("Digite o ano de seu nascimento: ");
		an = v.nextInt();
		
		idade = aa - an;
		
		if(idade < 16) {
			System.out.println("Você não pode votar este ano.");
		
		}else {
			System.out.println("Você pode votar este ano.");
		
		}
		v.close();
		
		}
		
	}