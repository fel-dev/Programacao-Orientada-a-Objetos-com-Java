package com.algaworks.curso.fjoo.collections;

import java.util.ArrayList;
import java.util.List;

public class TesteListArrayList {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("José");
		Aluno a4 = new Aluno("Pedro");
		
		List<Aluno> alunos = new ArrayList<Aluno>();

		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);		// ArrayList<> aceita repetição
		alunos.add(a4);		// mantém a ordem de inserção diferente do HashSet<>
		
		imprimirAlunos(alunos);
	}
	
	public static void imprimirAlunos(List<Aluno> alunos) {
		for (Aluno a : alunos) {															// --->> for (int i = 0; i < alunos.size(); i++) {
			System.out.println("Nome: " + a.getNome());					//	Aluno a = alunos.get(0); ---> alunos[0]	
		}
	}
	
}