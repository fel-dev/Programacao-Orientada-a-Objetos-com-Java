package com.algaworks.cap7.JOptionPane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class ExemploJOptionPane1 {

	// Serve para mostrar mensagens na tela

	public static void main(String[] args) throws Exception {		
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());// troca o ícone do diálogo

		JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!"); // Diálogo mais simples
		
	}

}
