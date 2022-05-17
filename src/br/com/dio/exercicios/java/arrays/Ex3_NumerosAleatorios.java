package br.com.dio.exercicios.java.arrays;

import java.util.Random;

/**
 * ***** ARRAYS UNIDIMENSIONAIS **********************
 *   Fa�a um Programa que leia 20 n�meros inteiros aleat�rios (entre 0 e 100), 
 *   armazene-os num vetor.Ao final, mostre os n�meros e seus sucessores.
 * **/

public class Ex3_NumerosAleatorios {
	
	private Random random;
	
	private int[] numerosAleatorios = new int[20];

	public Ex3_NumerosAleatorios() {
		System.out.println("                         ARRAYS UNIDIMENSIONAIS                          "+"\n");
		System.out.println(" Ex 3 :  N�meros Aleat�rios"+"\n");
		
		random = new Random();
		
		System.out.print("N�meros Aleat�rios: ");
		for (int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = random.nextInt(101);
			System.out.print(numerosAleatorios[i] + " ");
		}
		
		System.out.print("\nSeus sucessores: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero + 1) + " ");
		}
	}

	
	
}
