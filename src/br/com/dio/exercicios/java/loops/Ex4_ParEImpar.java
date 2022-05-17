package br.com.dio.exercicios.java.loops;

import java.util.Scanner;

/**
 * ***** DO WHILE **********************
 *  Faça um programa que peça N números inteiros. 
 *  Calcule e mostre a quantidade de números pares e a quantidade de números impares.
 * **/

public class Ex4_ParEImpar {
	
	private Scanner scan;
	
	private int n,numero,pares = 0,impares = 0; 

	public Ex4_ParEImpar() {
		System.out.println("                         DO WHILE                          "+"\n");
		System.out.println(" Ex 4 :  Par e Ímpar"+"\n");
		
		scan = new Scanner(System.in);
		
		System.out.println("Quantos números deseja verificar ?");
		n = scan.nextInt();
		
		do {
			System.out.println("Número : ");
			numero = scan.nextInt();
			if(numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			n--;
		} while(n > 0);
		
		System.out.println("Foram passados " + pares + " pares e " + impares + " ímpares .");
	}
		

}
