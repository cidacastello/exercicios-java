package com.acrdev;

import java.util.Scanner;

public class AppCircunferencia {

	public static void main(String[] args) {

		/*
			 Declara um objeto do tipo Scanner nomedado teclado
			 para obter a entrada de dados a partir da janela (terminal) de comando
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		// declaração das variáveis
		double raio, area, comprimento;

		//entrada de dados
		System.out.print("Informe o valor do raio: ");
		//leitura do valor do raio
		raio = teclado.nextDouble(); //converte a entrada para o tipo double
		
		//processamento
		//valor do PI 3.14159
		area =  3.14159 * raio * raio;
		comprimento = 2 * Math.PI * raio; //também podemos utilizar a constante PI da classe Math
		
		//saída de dados - apresentando os valores calculados
		System.out.println("Area = " + area + " Comprimento = " + comprimento);

	}
}
