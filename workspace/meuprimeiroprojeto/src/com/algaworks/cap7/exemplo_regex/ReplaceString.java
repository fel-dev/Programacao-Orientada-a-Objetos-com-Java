public class ReplaceString {
	
	public static void main(String[] args) {
		String texto = "O valor do produto é R$ @xxx@.";

		// Expressão regular mais simples que tem replaceAll(regex, replacement)
		String novoTexto = texto.replaceAll("@xxx@", "2,50");
		System.out.println(novoTexto);
	}
}
