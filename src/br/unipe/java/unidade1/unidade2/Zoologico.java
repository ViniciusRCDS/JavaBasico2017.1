package br.unipe.java.unidade1.unidade2;

public class Zoologico {

	public static void main(String[] args) {

		
		Animal pepita = new Cachorro();
		((Cachorro)pepita).late();
		treina(pepita);

		
	}

	public static void treina(Animal animal) {
		animal.come();
		animal.dorme();
	}
}
