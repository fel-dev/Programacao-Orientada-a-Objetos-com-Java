public class TestesClassesWrapper {
// 4.1. Wrappers do java.lang https://app.algaworks.com/aulas/56/wrappers-do-javalang
	public static void main(String[] args) {
		// byte, short, int,     long, float, double e char
		// Byte, Short, Integer, Long, Float, Double e Character
		
		int x = 5;
		// Integer i = new Integer(5);  -- Deprecated
        Integer i = Integer.valueOf(5);
		
		byte y = i.byteValue();
		// xxxValue();
		
		String valor = "15.5";
		// Float v = new Float(valor); -- Deprecated
        Float v = Float.valueOf(valor);
		System.out.println(v + 3);
		
		int idade = Integer.parseInt("27"); // parseXXX
		System.out.println("Daqui a 5 anos você terá: " + (idade + 5) + " anos.");
		
		try {
			double custo = Double.parseDouble("Vinte e tres reais e cinquenta centavos");
			System.out.println("Custo total: " + custo);
		} catch (NumberFormatException e) {
			System.err.println("Numero inválido para conversão.");
		}
        
        try {
            int valor2 = Integer.parseInt("Vinte e tres reais e cinquenta centavos");
            System.out.println("Custo total: " + valor2);
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Numero inválido para conversão.");
        }

    }
	
}

/*
A partir da versão 9 do Java os construtores das classes wrraper foram depreciados.

A forma adotada para a conversão de tipos primitivos em wrrapers é:
<WrapperType>.valueOf(<primitiveType>)
Em <WrapperType> pode ser Byte, Short, Integer, Long, Float, Double, Boolean ou Character.

Em <primitiveType> deve ser colocado o valor desejado do tipo primitivo equivalente. Também pode ser colocada uma string, desde que seja compatível com o tipo do wrraper.

O motivo da depreciação dos construtores das classes wrapper a partir do Java 9 foi para promover uma padronização no uso de métodos estáticos para a criação de objetos wrappers, em vez de usar construtores.

GPTChat Resposta:
Ao usar o método estático valueOf() para criar objetos wrapper, o Java pode aproveitar o cache interno de valores comuns usados pelos wrappers, economizando recursos e melhorando a eficiência da aplicação.

Além disso, usar o método valueOf() promove uma melhor legibilidade e clareza do código, pois o nome do método indica claramente que ele está convertendo um valor de um tipo primitivo para um objeto wrapper.

Dessa forma, a depreciação dos construtores das classes wrapper faz parte de uma iniciativa do Java para incentivar boas práticas de programação e melhorar a eficiência das aplicações.
 */
