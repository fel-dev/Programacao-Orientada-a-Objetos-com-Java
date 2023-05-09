package com.algaworks.curso.fjoo.collections;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("José");
		Aluno a4 = new Aluno("Pedro");
		
		Map<String, Aluno> alunos = new HashMap<String, Aluno>();  //  Chave e valor 
		
		alunos.put("1", a1);		// código do aluno e no valor o objeto aluno
		alunos.put("2", a2);
		alunos.put("3", a3);
		alunos.put("4", a4); // e não aceita ter chave repetida
		alunos.put("5", a4); //  o mesmo objeto pode ser referenciado por várias chaves no caso objeto a4 é ref. pelo 4 e 5
		
		imprimirAlunos(alunos);
		
		Aluno alunoRecuperado = alunos.get("3");// pode recuperar o objeto pela chave
		System.out.println("Aluno de chave 3: " + alunoRecuperado.getNome()); 
	}

	private static void imprimirAlunos(Map<String, Aluno> alunos) { 
		for (Aluno a : alunos.values()) {							// escolhe qual o tipo de dado que vai retornar (chave ou valor)
			System.out.println("Nome: " + a.getNome());
		}
	}
	
}