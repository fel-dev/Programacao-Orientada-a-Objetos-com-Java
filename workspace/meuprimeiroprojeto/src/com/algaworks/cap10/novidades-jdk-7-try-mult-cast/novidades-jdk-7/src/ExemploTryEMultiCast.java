import java.util.Scanner;

public class ExemploTryEMultiCast {
	
	
	public static void main(String[] args) { 
		try (Scanner entrada = new Scanner(System.in)) { // com o Try with resources, fecha automaticamente os recursos (não é necessário fechar o Scanner) 
			

			System.out.print("Digite seu nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Digite sua idade: ");
			String idade = entrada.nextLine();

			try {
			SalvarAluno.salvar(nome, idade);
			} catch (NegocioException | NumberFormatException e) { // multi-catch
				System.out.println("Impossível completar operação. Motivo: " + e.getMessage());
			}

		}
		// entrada.close();
	}
}
