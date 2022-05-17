package br.com.dio.exercicios.java.arrays;

import java.util.Scanner;

/**
 * ***** ARRAYS UNIDIMENSIONAIS **********************
 *   Faça um Programa que leia um vetor de 6 caracteres, 
 *   e diga quantas consoantes foram lidas.Imprima as consoantes.
 * **/

public class Ex2_Consoantes {
	
	private Scanner scan;
	
	private char[] vetor;
	
	private int count = 0,quantidadeConsoantes = 0;
	
	private String letrasOuConsoantes = "";

	public Ex2_Consoantes() {
		System.out.println("                         ARRAYS UNIDIMENSIONAIS                          "+"\n");
		System.out.println(" Ex 2 :  Consoantes"+"\n");
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite 6 caracteres");
		
		while(count < 6) {
			System.out.println("Letra : ");
			letrasOuConsoantes += scan.next();
			count++;
		}
		
		vetor = letrasOuConsoantes.toCharArray();
		
		letrasOuConsoantes = "";
		count = 0;
		
		do {
			if(verificaSeEVogal(String.valueOf(vetor[count]))) {
				letrasOuConsoantes += vetor[count]+" ";
				quantidadeConsoantes++;
			}
			count++;
		} while(count < vetor.length);
		
		System.out.println("Foram lidas " + quantidadeConsoantes + " consoantes .");
		System.out.println("Consoantes : " + letrasOuConsoantes);
	}

	private boolean verificaSeEVogal(String letra) {
		return !(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || 
				letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
				letra.equalsIgnoreCase("u"));
	}
	
}
