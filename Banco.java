import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Emprestimo dinheiro = new Emprestimo();

		System.out.println("\tBanco\n");
		System.out.println("Digite seu nome: ");
		dinheiro.setNomeUsuario(leitor.nextLine());
		System.out.println("Digite a sua idade: ");
		dinheiro.setIdade(leitor.nextInt());
		System.out.println("Digite o valor do emprestimo: ");
		dinheiro.setValorEmprestimo(leitor.nextFloat());
		System.out.println("Digite os juros ao mes: ");
		dinheiro.setPercentualJuroMes(leitor.nextFloat());
		System.out.println("Meses para pagar: ");
		dinheiro.setMesesParaPagar(leitor.nextInt());
		dinheiro.imprimir();
		dinheiro.calcularEmprestimo();
		leitor.close();

	}

}