package com.acrdev;

import java.util.Scanner;

public class AppTrapezio {

	public static void main(String[] args) {

		/*
		 * Declara um objeto do tipo Scanner nomedado sc para obter a entrada de
		 * dados a partir da janela (terminal) de comando
		 */

		Scanner sc = new Scanner(System.in);

		//declara��o das vari�vies
		
		double baseMaior, baseMenor, altura, area;
		
		//entrada de dados
		System.out.print("Digite o valor da base maior: ");
		
		baseMaior = sc.nextDouble();
		
		System.out.print("Digite o valor da base menor: ");
		baseMenor = sc.nextDouble();
		
		System.out.print("Digite o valor da altura: ");
		altura = sc.nextDouble();
		
		//processamento
		area = ((baseMaior + baseMenor)/2)*altura;
		
		//sa�da de dados
		//O m�todo System.out.printf mostra os dados na sa�da formatados
		//para o tipo double utiliza-se %2f
		System.out.printf("�rea do Trap�zio � %2f", area);
		
		//fecha o sc
		sc.close();
		
	}

}
