package capitulos1ao4;

public class Principal {

	public static void main(String[] args) {
		// int x;
		// x = 10;
		// Carro carro;
		// carro = new Carro();


		Carro meuCarro = new Carro(); // Instanciando um objeto do tipo Carro, e atribuindo a variável meuCarro, que é do tipo Carro. Na mesma linha
		
		System.out.println("Modelo: " + meuCarro.modelo);		// FIAT; 
		System.out.println("Ano: " + meuCarro.anoDeFabricacao);	// 0
		
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.cor = "prata";
		meuCarro.anoDeFabricacao = 2011;

		Carro seuCarro = new Carro();
		seuCarro.fabricante = "Honda";
		seuCarro.modelo = "Civic";
		seuCarro.cor = "preto";
		seuCarro.anoDeFabricacao = 2009;

		System.out.println("Meu carro");
		System.out.println("-------------------");
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano: " + meuCarro.anoDeFabricacao);

		System.out.println();
		System.out.println("Seu carro");
		System.out.println("-------------------");
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Ano: " + seuCarro.anoDeFabricacao);

	}
	
}