package br.unipe.java.unidade1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int soma;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe 1 numero:");
		int n1 = leitor.nextInt();
		System.out.println("Informe 1 numero:");
		int n2 = leitor.nextInt();

		soma = n1 + n2;

		System.out.println("\nO resultado foi " + soma);
		leitor.close();
	}
}