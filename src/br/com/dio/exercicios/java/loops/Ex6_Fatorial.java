package br.com.dio.exercicios.java.loops;

import java.util.Scanner;

/**
 * ***** FOR **********************
 * Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio.
 * Ex.: 5!=5.4.3.2.1=120
 * **/

public class Ex6_Fatorial {
	
	private Scanner scan;
	
	private int numero,fatorial = 1;

	public Ex6_Fatorial() {
		System.out.println("                         FOR                          "+"\n");
		System.out.println(" Ex 6 :  Fatorial"+"\n");
		
		scan = new Scanner(System.in);
		
		System.out.println("Calcular o fatorial de qual n�mero ?");
		numero = scan.nextInt();
		
		for(int i = numero;i >= 1; i--) {
			fatorial *= i;
		}
		
		System.out.println(numero +"! = "+ fatorial);
	}

	
	
}
