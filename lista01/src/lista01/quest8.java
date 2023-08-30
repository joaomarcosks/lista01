package lista01;

import java.util.Scanner;

public class quest8 {

	public static void main(String[] args) {
		
		Scanner h = new Scanner(System.in);
		int hi;
		int hf;
		int duracao;
		
		System.out.println("Digite a hora que a partida foi iniciada: ");
		hi = h.nextInt();

		System.out.println("Digite a hora que a partida foi finalizada: ");
		hf = h.nextInt();
		
		if(hi == hf) {
			duracao = 24;
			System.out.println("A partida durou 24 horas");
		}else if(hi < hf) {
			duracao = hf - hi;
			System.out.println("A partida durou " + duracao + " horas");
		}else {
			duracao = (24 - hi) + hf;
			System.out.println("A partida durou " + duracao + " horas");
		}
		
		h.close();
	}

}
