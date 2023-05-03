package com.algaworks.curso.fjoo.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;



import static utilitarios.Console.Limpar;
public class TesteCalendar {
	
	public static void main(String[] args) {
		Limpar();

		Calendar c = new GregorianCalendar(); // GregorianCalendar é uma subclasse de Calendar -- mais usado. Não serve pra China, porra!
		// da pra adicionar ou subtrair dias, meses, anos, horas, minutos, segundos, milisegundos, etc.
		
		c.set(Calendar.DAY_OF_MONTH, 31); // seta o dia do mês
		c.set(Calendar.MONTH, 0); 				// seta o mês (janeiro é 0)
		c.set(Calendar.YEAR, 2023); 			// seta o ano
		c.set(Calendar.HOUR_OF_DAY, 2); 	// seta a hora do dia
		c.set(Calendar.MINUTE, 16); 			// seta os minutos
		c.set(Calendar.SECOND, 30); 			// seta os segundos

		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(c.getTime())); // format requer parametro do tipo Date. Então usa getTime() que retorna um objeto Date e que é o que o formatador precisa.

		// Adicionando 1 dias, indo pra outro mês, outro ano, etc.
		c.add(Calendar.MONTH, 1);
		System.out.println(formatador.format(c.getTime()));

		// Rolando 1 dia, sem alterar o mês, ano, etc.	
		c.roll(Calendar.DAY_OF_MONTH, 1);
		System.out.println(formatador.format(c.getTime()));

	}
}

/* *** Observações ***
 *  
 * O add() e o set() são métodos de Calendar. O getTime() é de Date.
 * O add() é como tivesse somando ou subtraindo. O set() é como tivesse setando um valor.
 * O roll() é como o add(), mas não muda o mês, ano, etc. Se passar do limite, ele volta. é quando vc qr mexer só num campo específico.não muda o mês, ano, etc. Se passar do limite, ele volta. é quando vc qr mexer só num campo específico, porra!
 */
