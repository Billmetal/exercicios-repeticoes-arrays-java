package br.com.dio.exercicios.java.arrays;

import java.util.Random;

/**
 * ***** ARRAYS UNIDIMENSIONAIS **********************
 *   Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100), 
 *   armazene-os num vetor.Ao final, mostre os números e seus sucessores.
 * **/

public class Ex3_NumerosAleatorios {
	
	private Random random;
	
	private int[] numerosAleatorios = new int[20];

	public Ex3_NumerosAleatorios() {
		System.out.println("                         ARRAYS UNIDIMENSIONAIS                          "+"\n");
		System.out.println(" Ex 3 :  Números Aleatórios"+"\n");
		
		random = new Random();
		
		System.out.print("Números Aleatórios: ");
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
