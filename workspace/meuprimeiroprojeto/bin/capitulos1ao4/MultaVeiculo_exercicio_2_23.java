package workspace.meuprimeiroprojeto.bin.capitulos1ao4;
import java.util.Scanner;

public class MultaVeiculo_exercicio_2_23 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tipo do veiculo: (passeio, caminhao)");
        String tipoVeiculo = entrada.nextLine();

        System.out.println("Velocidade maxima permitida: ");
        int velocidadeMaxima = entrada.nextInt();

        System.out.println("Velocidade do veiculo: ");
        int velocidadeVeiculo = entrada.nextInt();

        // passeio > 10% da velocidade máxima
        // caminhão > 5% recebe multa
        // if (tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1) {
        //     System.out.println("Multa");
        // } else if (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05) {
        //     System.out.println("Multa");
        // };

        if ((tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1) || (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05)) {
            System.out.println("Multa");
        };
    }
}
