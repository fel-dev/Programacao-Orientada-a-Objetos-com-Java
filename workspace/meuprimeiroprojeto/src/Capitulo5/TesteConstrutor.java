package capitulo5;

public class TesteConstrutor {
    public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João");
		System.out.println("Nome: \"" + p1.nome + "\" tem " + p1.idade + " anos.");     
		// int e cia são sempre inicializados com 0. Por isso a saida é: Nome: "João" tem 0 anos.

		Pessoa p2 = new Pessoa("Maria", 22);
		System.out.println("Nome: \"" + p2.nome + "\" tem " + p2.idade + " anos.");
	}
}

/* 5.4. Construtores
 Java e Orientação a Objetos Orientação a Objetos - parte 2 Construtores
 https://app.algaworks.com/aulas/65/construtores */
