package capitulos1ao4;
public class ExemploThis {
    
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Fox";

        System.out.println("Modelo antes: " + carro.modelo);

        carro.alterarModelo("Voyage");

        System.out.println("Modelo depois: " + carro.modelo);
    }
}
