
public class Venda {
	int pCodigo;
	String descricao;
	float valorVenda;
	float valorCusto;
	boolean promocao;
	String nome;
	int codigo;
	String endereco;
	float comissao=0.05f;
	
	Produto produto = new Produto(pCodigo, descricao, valorVenda, valorCusto, promocao);
	Vendedor vendedor = new Vendedor(nome, codigo, endereco);
	
	public float desconto;
	public int quantidadeItens;
	public float valor;
	
	public void calcularValor(){
		
	}
	
	public void calcularComissao(){
		
	}
	
	public void efetuarDesconto(){
		
	}
	
	public void imprimir(){
		System.out.println("Vendedor\n\nCodigo: "+codigo+"\nNome: "+nome+"\nComissao: "+comissao);
		System.out.println("\n\nQuantidade de items: "+quantidadeItens);
		System.out.println("\n\nProduto\n\nCodigo: "+pCodigo+"\nDescricao: "+descricao+"\nValor da venda: "+valorVenda+"\nPromocao: "+promocao+"\nValor do desconto: "+desconto);
	}
	
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
}
