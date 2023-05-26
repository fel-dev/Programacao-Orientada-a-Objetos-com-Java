
public class SalvarAluno {

	public static void salvar(String nome, String idade) {
		if (nome == null || nome.trim().isEmpty()) {
			throw new NegocioException("Nome não pode ser nulo ou vazio");
		}

		int i = Integer.parseInt(idade);
		System.out.println("Salvando no banco de dados...");

	}

}
