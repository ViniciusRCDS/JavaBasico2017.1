
public class Produto {
	public int pCodigo;
	public String descricao;
	public float valorVenda;
	public float valorCusto;
	public boolean promocao;
	
	public Produto(int pCodigo, String descricao, float valorVenda, float valorCusto, boolean promocao) {
		super();
		this.pCodigo = pCodigo;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCusto = valorCusto;
		this.promocao = promocao;
	}

	public int getpCodigo() {
		return pCodigo;
	}

	public void setpCodigo(int pCodigo) {
		this.pCodigo = pCodigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public float getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(float valorCusto) {
		this.valorCusto = valorCusto;
	}

	public boolean isPromocao() {
		return promocao;
	}

	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}
}
