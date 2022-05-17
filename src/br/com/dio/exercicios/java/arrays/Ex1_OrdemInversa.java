package br.com.dio.exercicios.java.arrays;

import java.util.Scanner;

/**
 * ***** ARRAYS UNIDIMENSIONAIS **********************
 *  Faça um Programa que leia um vetor de 5 números inteiros
 *  e mostre-os na ordem inversa.
 * **/

public class Ex1_OrdemInversa {
	
	private Scanner scan;
	
	private int[] vetor = new int[5];
	private int count = 0;

	public Ex1_OrdemInversa() {
		System.out.println("                         ARRAYS UNIDIMENSIONAIS                          "+"\n");
		System.out.println(" Ex 1 :  Ordem Inversa"+"\n");
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite 5 números inteiros");
		
		while(count < 5) {
			System.out.println("Número : ");
			vetor[count] = scan.nextInt();
			count++;
		}
		
		System.out.print("\nVetor Inverso: ");
		for(int i = (vetor.length - 1); i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
	}

	
}
