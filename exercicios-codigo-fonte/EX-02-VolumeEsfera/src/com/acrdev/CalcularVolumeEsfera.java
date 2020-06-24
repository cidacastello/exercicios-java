package com.acrdev;

import java.util.Scanner;

public class CalcularVolumeEsfera {

	public static void main(String[] args) {
		
		/*
		 Declara um objeto do tipo Scanner nomedado sc
		 para obter a entrada de dados a partir da janela (terminal) de comando
	 */
		Scanner sc = new Scanner(System.in);
		
		// declara��o das vari�veis
		
		double raio, volume;
		
		//entrada de dados
		
		System.out.printf("Digite o valor do raio: "); 
		raio = sc.nextDouble();
		
		//processamento
		
		volume = 4.0/3.0 * Math.PI * Math.pow(raio, 3);
		/*
		 * O comando acima substitui
		 * volume = 4.0/3.0 * 3.14159 * raio * raio * raio;
		 * 
		 * Math.PI -> valor do PI
		 * Math.pow(raio, 3) -> pow � a fun��o de potencia��o 
		 */
		 

		//sa�da de dados
		
		System.out.println("O volume da esfera � " + volume);
		
		//fecha sc
		sc.close();
	}

}
