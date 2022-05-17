package br.com.dio.exercicios.java.loops;

import java.util.Scanner;

/**
 * ***** WHILE **********************
 * Faça um programa que peça uma nota, entre zero e dez. 
 * Mostre uma mensagem caso o valor seja inválido e continue pedindo 
 * até que o usuário informe um valor válido.
 * **/

public class Ex2_Nota {
	
	private Scanner scan;
	
	private int nota;

	public Ex2_Nota() {
		System.out.println("                         WHILE                                         "+"\n");
		System.out.println(" Ex 2 :  Nota"+"\n");
		
		scan = new Scanner(System.in);
		
		System.out.println("Nota : ");
		nota = scan.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota inválida ! ,  Digite novamente :");
			System.out.println("Nota : ");
			nota = scan.nextInt();
		}
		
		System.out.println("Nota correta : " + nota);
	}
	
	

}
