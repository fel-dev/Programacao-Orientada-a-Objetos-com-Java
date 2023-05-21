import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class GravandoEmails {
	
	public static void main(String[] args) {
		String[] emails = {"joao2@joao.com", "maria2@maria.com", "ricardo2@ricardo.com"};

		// Armazena no buffer e descarrega no arquivo               (nome do arquivo, append)
		// try (BufferedWriter writer = new BufferedWriter(new FileWriter("emails.txt", true))){
			try (PrintStream writer = new PrintStream("emails2.txt")){ // PrintStream é mais rápido
			for (String email : emails) {
				// writer.write(email);
				// writer.newLine(); // n precisa pq o println já faz isso no PrintStream
				writer.println(email);
			}
		} catch (IOException e) {
			System.err.println("Erro ao gravar arquivo: " + e.getMessage());
		} 
	}
}
