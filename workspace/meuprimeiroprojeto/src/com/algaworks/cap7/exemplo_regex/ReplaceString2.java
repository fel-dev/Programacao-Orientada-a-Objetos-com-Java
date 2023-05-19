public class ReplaceString2 {
	
	public static void main(String[] args) {
		String texto = "O valor do produto é R$ @xxx@.";

		// Essa usa o + para indicar que o x pode aparecer uma ou mais vezes
		String novoTexto = texto.replaceAll("@x+@", "2,50");
		System.out.println(novoTexto);
	}
}
