package br.unipe.java.unidade1;

public class Cliente {

	public String nome;
	private String endereco;
    public static  String CONSTANTE="UMA_CONSTANTE";
	
	public Cliente(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
