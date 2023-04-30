package cap01ao04;
public class Principal2_old2 {
    public static void main(String[] args) {
        Carro seuCarro = new Carro();

        seuCarro.anoDeFabricacao = 2009;
        seuCarro.cor = "preto";

        seuCarro.dono.nome = "José Pereira"; // Primeiro, criamos o objeto dono, depois atribuímos os valores. Caso contrário, teríamos um erro de NullPointerException. Ou ir na classe Carro e trocar a inicialização padrão, incializando as                                     variáveis de instância com valores que a gente queira.
    }
}
