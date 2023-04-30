package cap01ao04;
public class Passeio {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "João";
         
        // p1.cachorro = new Cachorro();
		//  Cachorro cachorro = new Cachorro()
		// p1.cachorro = cachorro;

        p1.cachorro = new Cachorro();
        p1.cachorro.nome = "Baby";
        p1.cachorro.idade = 3;
        p1.cachorro.raca = "Vila-lata";
        p1.cachorro.sexo = 'F';

        Caminhada c = new Caminhada();
        c.andar(p1);
		
    }
}
