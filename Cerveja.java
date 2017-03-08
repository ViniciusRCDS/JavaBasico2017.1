package br.unipe.java.unidade1;

import java.util.Scanner;

public class Cerveja {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o numero de cervejas: ");
		int z = leitor.nextInt();
		while (z != 0)
		{
			System.out.println(z + "Cervejas no freezer");
			System.out.println("Pega 1 garrafa e passa para frente");
			z--;
			System.out.println("Agora são " + z + "cervejas");
			
			if (z == 0){
				System.out.println("Cerveja acabou");
				System.out.println("Quantas cervejas deseja adicionar ?");
				z = leitor.nextInt();
				System.out.println(z + "Adicionais");
			}
		}
	}
}
