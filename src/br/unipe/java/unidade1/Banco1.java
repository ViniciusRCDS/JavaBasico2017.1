package br.unipe.java.unidade1;

public class Banco1 {
	private ContaCorrente[] contas;
	
	public void cadastraConta(String nome, String endereco, double valor){
		
		Cliente cliente = new Cliente (nome, endereco);
		ContaCC contaCC = new ContaCC (1, cliente, valor);
		
		
	}

}
