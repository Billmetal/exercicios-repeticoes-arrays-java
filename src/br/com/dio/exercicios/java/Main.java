package br.com.dio.exercicios.java;

import br.com.dio.exercicios.java.arrays.Ex1_OrdemInversa;
import br.com.dio.exercicios.java.arrays.Ex2_Consoantes;
import br.com.dio.exercicios.java.arrays.Ex3_NumerosAleatorios;
import br.com.dio.exercicios.java.loops.Ex1_NomeIdade;
import br.com.dio.exercicios.java.loops.Ex2_Nota;
import br.com.dio.exercicios.java.loops.Ex3_MaiorEMedia;
import br.com.dio.exercicios.java.loops.Ex4_ParEImpar;
import br.com.dio.exercicios.java.loops.Ex5_Tabuada;
import br.com.dio.exercicios.java.loops.Ex6_Fatorial;

public class Main {

	public static void main(String[] args) {
//		exerciciosEstruturaRepeticao();
		exerciciosArrays();
	}
	
	private static void exerciciosEstruturaRepeticao() {
		System.out.println("------------------ EXERCÍCIOS ESTRUTURAS DE REPETIÇÃO ----------------------"+"\n");
//		new Ex1_NomeIdade();
//		new Ex2_Nota();
//		new Ex3_MaiorEMedia();
//		new Ex4_ParEImpar();
//		new Ex5_Tabuada();
		new Ex6_Fatorial();
	}
	
	private static void exerciciosArrays() {
		System.out.println("------------------ EXERCÍCIOS ARRAYS ----------------------"+"\n");
//		new Ex1_OrdemInversa();
//		new Ex2_Consoantes();
		new Ex3_NumerosAleatorios();
	}

}
