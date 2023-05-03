package com.algaworks.curso.fjoo.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
// sempre importar a data do pacote java.util e não do java.sql, porra!
import java.util.Date;

import static utilitarios.Console.Limpar;

public class TesteDatas {
	
	public static void main(String[] args) {

		Limpar();

		Date hoeje = new Date(); // o objeto Date representa tanto a data quanto a hora.
		System.out.println(hoeje);

		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // tbm pode tirar a hora
		System.out.println(formatador.format(hoeje));

		String dataAniversario = "20/01/1980";
		DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date aniversario = formatador2.parse(dataAniversario);
			System.out.println(formatador.format(aniversario));
		} catch (ParseException e) {
			System.out.println("Formato de data inválido");
		}

	}
	
}
