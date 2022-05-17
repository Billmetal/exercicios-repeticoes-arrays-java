package br.com.dio.exercicios.java.loops;

import java.util.Scanner;

/**
 * ***** DO WHILE **********************
 * Fa�a um programa que leia 5 n�meros e 
 * informe o maior n�mero e a m�dia desses n�meros.
 * **/

public class Ex3_MaiorEMedia {
	
	private Scanner scan;
	
	private int numero,maior,soma,count = 1;

	public Ex3_MaiorEMedia() {
		System.out.println("                         DO WHILE                          "+"\n");
		System.out.println(" Ex 3 :  Maior e M�dia"+"\n");
		
		scan = new Scanner(System.in);
		
		System.out.println("N�mero : ");
		maior = scan.nextInt();
		soma = maior;
		
		do {
			System.out.println("N�mero : ");
			numero = scan.nextInt();
			if(numero > maior) maior = numero;
			soma += numero;
			count++;
		} while(count < 5);
		
		System.out.println("O maior n�mero � " + maior + " , e a m�dia � " + media(soma));
	}
	
	private int media(int valor) {
		return valor / 5;
	}
	
}
