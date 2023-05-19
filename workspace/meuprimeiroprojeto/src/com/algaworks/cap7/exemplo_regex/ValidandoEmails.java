import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoEmails {
	
	public static void main(String[] args) {
		String[] emails = {"joao@joao.com", "maria@", "jose@jose", "ricardo@ricardo.com"};

		// Alguns exemplo de regex pra email: https://www.regular-expressions.info/email.html
		
		/* 	
		* \w+ - um ou mais caracteres alfanuméricos
		* \w+@ - um ou mais caracteres alfanuméricos até encontrar @
		* .(ponto)	Any character (may or may not match line terminators)
		* \w+\\. - um ou mais caracteres alfanuméricos até encontrar ponto (.) precisa escapar \\.
		* \w+ - um ou mais caracteres alfanuméricos
		* fonte: https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
		*/
		
		Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				System.out.println(email + " é um email válido");
			}
		}
	}
}
