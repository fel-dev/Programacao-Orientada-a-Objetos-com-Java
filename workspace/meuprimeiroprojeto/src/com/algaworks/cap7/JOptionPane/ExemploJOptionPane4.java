package com.algaworks.cap7.JOptionPane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class ExemploJOptionPane4 {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		Object[] possibilidades = {"Masculino", "Feminino"};
		String sexo = (String) JOptionPane.showInputDialog(null, "Selecione sexo", "AlgaWorks", JOptionPane.PLAIN_MESSAGE, null
						, possibilidades, possibilidades[0]);
		
		System.out.println("Sexo selecionado: " + sexo);
		
		String nome = (String) JOptionPane.showInputDialog(null, "Digite seu nome", "AlgaWorks", JOptionPane.PLAIN_MESSAGE, null
				, null, null);
		System.out.println("Seu nome é: " + nome);
		
	}
	
}

// https://app.algaworks.com/aulas/465/joptionpane
//	7.3. JOptionPane
// Mais informações: https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
