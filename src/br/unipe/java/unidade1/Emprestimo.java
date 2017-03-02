
public class Emprestimo {
	String nomeUsuario;
	private int idade;
	private float valorEmprestimo;
	private float percentualJuroMes;
	private int mesesParaPagar;
	
	public void imprimir(){
		System.out.println("\nNome: "+nomeUsuario+"\nIdade: "+idade+"\nValor do Emprestimo: "+valorEmprestimo+"\nJuros ao mes: "+percentualJuroMes+"%"+"\nMeses para pagar: "+mesesParaPagar);
	}
	
	public void calcularEmprestimo(){
		if(idade>=18 && idade<=23){
			valorEmprestimo += (valorEmprestimo/mesesParaPagar)*percentualJuroMes;
		}
		if(idade>23 && idade<=33){
			valorEmprestimo += (valorEmprestimo*10)/100;
		}
		System.out.println("\nO valor do emprestimo somado aos juros vai ser de R$"+valorEmprestimo);
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(float valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}

	public float getPercentualJuroMes() {
		return percentualJuroMes;
	}

	public void setPercentualJuroMes(float percentualJuroMes) {
		this.percentualJuroMes = percentualJuroMes;
	}

	public int getMesesParaPagar() {
		return mesesParaPagar;
	}

	public void setMesesParaPagar(int mesesParaPagar) {
		this.mesesParaPagar = mesesParaPagar;
	}
}
