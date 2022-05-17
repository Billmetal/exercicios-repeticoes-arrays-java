package br.com.dio.exercicios.java.arrays;

import java.util.Random;

/**
 * ***** ARRAYS MULTIDIMENSIONAIS **********************
 *   Gere e imprima uma matriz M 4x4 com valores aleat�rios entre 0-9. 
 *   Ap�s isso determine o menor n�mero da matriz e a sua posi��o(linha, coluna).
 * **/

public class Ex4_ArrayMultidimensional {
	
	private Random random;
	
	private int menor = 10,linha,coluna,numero;
	
	private int[][] M = new int[4][4];

	public Ex4_ArrayMultidimensional() {
		System.out.println("                         ARRAYS MULTIDIMENSIONAIS                          "+"\n");
		System.out.println(" Ex 4 :  Array Multidimensional"+"\n");
		
		random = new Random();
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				numero = random.nextInt(10);
				M[i][j] = numero;
				System.out.print(numero + " ");
				if(numero < menor) {
					menor = numero;
					linha = i;
					coluna = j;
				}
			}
			System.out.println("\n");
		}
		
		System.out.println("O menor n�mero da matriz � " + menor + " , "+
				"na linha " + (linha + 1) + " e coluna " + (coluna + 1));
	}

	
	
}
