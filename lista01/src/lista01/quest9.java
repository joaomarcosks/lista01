package lista01;

import java.util.Scanner;

public class quest9 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		double sh;
		double salario;
		int horas;
		
		System.out.println("Digite a quantidade de horas trabalhadas no mes: ");
		horas = s.nextInt();
		
		System.out.println("Digite o valor pago pela sua hora de trabalho: ");
		sh = s.nextDouble();
		
		if(horas > 160) {
			salario = (horas - 160) * (sh * 0.5 + sh) + (sh * 160);
			System.out.println("Seu salario é: " + salario);
		}else {
			salario = sh * horas;
			System.out.println("Seu salario é: " + salario);
		}
		
		s.close();
	}

}
