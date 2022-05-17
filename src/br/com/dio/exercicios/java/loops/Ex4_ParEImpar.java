package br.com.dio.exercicios.java.loops;

import java.util.Scanner;

/**
 * ***** DO WHILE **********************
 *  Fa�a um programa que pe�a N n�meros inteiros. 
 *  Calcule e mostre a quantidade de n�meros pares e a quantidade de n�meros impares.
 * **/

public class Ex4_ParEImpar {
	
	private Scanner scan;
	
	private int n,numero,pares = 0,impares = 0; 

	public Ex4_ParEImpar() {
		System.out.println("                         DO WHILE                          "+"\n");
		System.out.println(" Ex 4 :  Par e �mpar"+"\n");
		
		scan = new Scanner(System.in);
		
		System.out.println("Quantos n�meros deseja verificar ?");
		n = scan.nextInt();
		
		do {
			System.out.println("N�mero : ");
			numero = scan.nextInt();
			if(numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			n--;
		} while(n > 0);
		
		System.out.println("Foram passados " + pares + " pares e " + impares + " �mpares .");
	}
		

}
