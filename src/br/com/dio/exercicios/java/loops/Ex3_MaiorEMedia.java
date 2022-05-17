package br.com.dio.exercicios.java.loops;

import java.util.Scanner;

/**
 * ***** DO WHILE **********************
 * Faça um programa que leia 5 números e 
 * informe o maior número e a média desses números.
 * **/

public class Ex3_MaiorEMedia {
	
	private Scanner scan;
	
	private int numero,maior,soma,count = 1;

	public Ex3_MaiorEMedia() {
		System.out.println("                         DO WHILE                          "+"\n");
		System.out.println(" Ex 3 :  Maior e Média"+"\n");
		
		scan = new Scanner(System.in);
		
		System.out.println("Número : ");
		maior = scan.nextInt();
		soma = maior;
		
		do {
			System.out.println("Número : ");
			numero = scan.nextInt();
			if(numero > maior) maior = numero;
			soma += numero;
			count++;
		} while(count < 5);
		
		System.out.println("O maior número é " + maior + " , e a média é " + media(soma));
	}
	
	private int media(int valor) {
		return valor / 5;
	}
	
}
