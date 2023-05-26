public class ExemploSeparadorDigitosLiterais {

    public static void main(String[] args) throws Exception {
        long populacaoSaoPaulo = 11_000_000L;
        long populacaoGrandeSaoPaulo = 11_000_000 + 9_000_000L;

        System.out.printf("População São Paulo: %d\n", populacaoSaoPaulo);
        System.out.printf("População Grande São Paulo: %d\n", populacaoGrandeSaoPaulo);

        double precoVeiculo = 200_000.99_1;
        System.out.printf("Preço veículo: %.3f\n", precoVeiculo);

        // evitar usar separador de dígitos literais no início e no final do número
        int x = 1____2_____3;
        int y = 1_2_3;
        System.out.printf("São iguais: %b\n", x == y);
    }
}
