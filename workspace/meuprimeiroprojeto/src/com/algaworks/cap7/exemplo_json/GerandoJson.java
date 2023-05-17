package com.algaworks.cap7.exemplo_json;

import java.util.ArrayList;
import java.util.List;

import com.algaworks.cap7.exemplo_json.modelo.Cliente;
import com.algaworks.cap7.exemplo_json.modelo.Endereco;
import com.algaworks.cap7.exemplo_json.modelo.Telefone;
import com.google.gson.Gson;

public class GerandoJson {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua das Laranjeiras", "Laranjeiras", "RJ");

		Telefone residencial = new Telefone("RESIDENCIAL", "21 3390-1234");
		Telefone comercial = new Telefone("COMERCIAL", "21 3390-4321");
		List<Telefone> telefones = new ArrayList<>();
		telefones.add(residencial);
		telefones.add(comercial);

		Cliente cliente = new Cliente("João Silva", 28, endereco, telefones);

		Gson gson = new Gson();
		String json = gson.toJson(cliente);

		System.out.println(json);


		System.out.println("\n----------------- Lendo Json -----------------------");
		System.out.println("-------------- Na classe Cliente -------------------\n");

		Cliente cliente2 = gson.fromJson(json, Cliente.class);

		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone().get(1).getNumero());



	}


	
}
