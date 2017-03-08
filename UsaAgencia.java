package br.unipe.java.unidade1;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class UsaAgencia {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();

		MenuAgencia menu = new MenuAgencia();
		int opcao = 0;
		String inputText;
		Float valorOperacao = 0.0f;
		while (true) {
			inputText = menu.menuPrincipal();
			opcao = Integer.parseInt(inputText);
			if (opcao == 1) {
				inputText = menu.inputSaque();
				valorOperacao =  Float.parseFloat(inputText);
				valorOperacao = conta.getSaldo()-valorOperacao;
				conta.setSaldo(valorOperacao);
				JOptionPane.showMessageDialog(null, conta.getSaldo());

			}
			if (opcao == 4 ){
				String msg = "Obrigado por usar FujiSystem";
				JOptionPane.showMessageDialog(null, msg);
				System.exit(0);
			}
		}

	}

}
