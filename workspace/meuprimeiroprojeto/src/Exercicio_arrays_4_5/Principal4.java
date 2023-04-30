
public class Principal4 {
// 3.12. Passando argumentos para métodos https://app.algaworks.com/aulas/51/passando-argumentos-para-metodos
	public static void main(String[] args) {
		FolhaPagamento folha = new FolhaPagamento();
		double salario = folha.calcularSalario(160, 12, 32.5, 40.2);
		
		System.out.println("Salário calculado: " + salario);
	}
	
}