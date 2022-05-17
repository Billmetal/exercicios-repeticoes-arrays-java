package br.com.dio.exercicios.java.loops;

import java.util.Scanner;

/**
 * ***** WHILE **********************
 * Faça um programa que leia conjuntos de dois valores, 
 * o primeiro representando o nome do aluno e o segundo representando a sua idade. 
 * (Pare o programa inserindo o valor 0 no campo nome)
 * **/

public class Ex1_NomeIdade {
	
	private Scanner scan;
	
	private String nome;
	
	private int idade;

	public Ex1_NomeIdade() {
		System.out.println("                         WHILE                                         "+"\n");
		System.out.println(" Ex 1 :  Nome e Idade"+"\n");
		
		scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Nome: ");
			nome = scan.next();
			
			if(nome.equals("0")) break;
			
			System.out.println("Idade: ");
			idade = scan.nextInt();
		}
		
		System.out.println("Programa parado por ser passado 0 no nome .");
	}

	
}
