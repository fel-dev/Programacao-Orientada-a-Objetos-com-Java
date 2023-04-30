package capitulos1ao4;
public class Principal2 {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Fusca";

        Carro seuCarro = new Carro();
        seuCarro.modelo = "Gol";

        meuCarro.ligarAgora();
        seuCarro.ligarAgora();
    }
}
