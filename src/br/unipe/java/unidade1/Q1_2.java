package br.unipe.java.unidade1;

import java.util.Scanner;

public class Q1_2 {

	public static void main(String[] args) {
		String nome;
		int idade;

		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe seu nome:");
		nome = leitor.nextLine();
		System.out.println("Informe a sua idade:");
		idade = leitor.nextInt();

		leitor.close();
	}

}
