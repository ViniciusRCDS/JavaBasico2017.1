package br.unipe.java.unidade1;

import java.util.Scanner;

public class EstruturaControle1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float valorSalario;
		float percentualAumento;
		float valorAumento = 0;
		
		System.out.println("Digite o seu salario atual: ");
		valorSalario=leitor.nextFloat();
		System.out.println("Digite o percentual de aumento: ");
		percentualAumento=leitor.nextFloat();
		
		valorAumento += valorSalario*(percentualAumento/100);
		valorSalario += valorSalario*(percentualAumento/100);
		
		System.out.println("\nSeu novo salario R$"+valorSalario);
		System.out.println("Teve um aumento de R$"+valorAumento);
		
		leitor.close();
	}

}
