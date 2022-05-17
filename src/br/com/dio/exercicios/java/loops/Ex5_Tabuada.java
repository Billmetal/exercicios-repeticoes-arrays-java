package br.com.dio.exercicios.java.loops;

import java.util.Scanner;

/**
 * ***** FOR **********************
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deve informar de qual numero ele deseja ver a tabuada. 
 * A saída deve ser conforme o exemplo abaixo:
 * Tabuada de 5:
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ...
 * 5 X 10 = 50
 * **/

public class Ex5_Tabuada {
	
	private Scanner scan;
	
	private int tabuada;

	public Ex5_Tabuada() {
		System.out.println("                         FOR                          "+"\n");
		System.out.println(" Ex 5 :  Tabuada"+"\n");
		
		scan = new Scanner(System.in);
		
		System.out.println("Tabuada de qual número ?");
		tabuada = scan.nextInt();
		
		System.out.println("Tabuada do " + tabuada + " : ");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
		}
	}

	
	
}
