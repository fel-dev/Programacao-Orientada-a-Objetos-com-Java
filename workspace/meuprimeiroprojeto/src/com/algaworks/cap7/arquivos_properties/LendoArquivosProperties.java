package com.algaworks.cap7.arquivos_properties;

import java.io.FileInputStream;
import java.util.Properties;

public class LendoArquivosProperties {
	
	public static void main(String[] args) throws Exception {
		Properties prop = new Properties(); // prop.setProperty(chave, valor);	
		prop.load(new FileInputStream("./config/config.properties")); // carrega um arquivo

		// Conectar no banco de dados
		String url = prop.getProperty("banco.dados.url");
		String usuario = prop.getProperty("banco.dados.usuario");
		String senha = prop.getProperty("banco.dados.senha");


		try {
			// Faz alguma coisa errada
			int x = 5 /0;
		} catch (Exception e) {
			// Se acontecer um erro, precisa informar ao administrador por email
			System.out.printf("Erro ao conectar no banco de dados de url: %s, usuario: %s\n", url, usuario);
			String email = prop.getProperty("email.admin");
			System.err.printf("Enviando email para %s informando o erro %s", email, e.getMessage());

		}
		
	}

}
