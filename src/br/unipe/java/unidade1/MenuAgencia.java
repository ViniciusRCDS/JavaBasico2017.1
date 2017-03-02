package br.unipe.java.unidade1;

import javax.swing.JOptionPane;

public class MenuAgencia {
	
	public String menuPrincipal (){
	
		String menu = "1 - Sacar \n";
		menu += "2 - Depositar \n";
		menu += "3 - Exibir Saldo \n";
		menu += "4 - Sair \n";
		
		String retorno = JOptionPane.showInputDialog(menu);
		
		return retorno;
	
	}
	public String inputSaque (){
		
		String texto = "Informe o valor a ser sacado";
		String valor = JOptionPane.showInputDialog(texto);
		
		return valor;
	
	}
}

