package br.unipe.java.unidade1;

public class Aplicacao {

	public static void main(String[] args) {
	
		Banco1 banco = new Banco1();
		
		System.out.println(Cliente.CONSTANTE);
		Cliente c = new Cliente("a", "a");
		c.setNome("Rodrigo");
		c.CONSTANTE= "Rodrigo";
		Cliente b = new Cliente ("b" , "b");
		c.CONSTANTE="Fujioka";
		
		Cliente.CONSTANTE = "Yumi";
		
		banco.cadastraConta("Rodrigo", "Rua X", 0.0);

	}

}
