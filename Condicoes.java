package br.unipe.java.unidade1;

import java.util.Scanner;

public class Condicoes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o numero: ");
		int z = leitor.nextInt();
		if (z == 10) {
			System.out.println("z � igual a 10:)");
		} else {
			System.out.println("z n�o � igual a 10");
		}
		System.out.println("Isso � enrola��o");
		leitor.close();
	}

}