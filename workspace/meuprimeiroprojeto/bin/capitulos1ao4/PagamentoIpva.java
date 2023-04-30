package workspace.meuprimeiroprojeto.bin.capitulos1ao4;
import java.util.Scanner;

public class PagamentoIpva {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o final da placa: " );
		int finalPlaca = entrada.nextInt();
		
		System.out.println("Confira abaixo as datas para o parcelamento:");

		switch (finalPlaca) {
            case 0:
                System.out.println("Vencimento dia 21 de janeiro.");
                System.out.println("Vencimento dia 21 de fevereiro.");
                System.out.println("Vencimento dia 23 de março.");
                break;
            case 1:
                System.out.println("Vencimento dia 24 de janeiro.");
                System.out.println("Vencimento dia 23 de fevereiro.");
                System.out.println("Vencimento dia 25 de março.");
                break;
            case 2:
                System.out.println("Vencimento dia 25 de janeiro.");
                System.out.println("Vencimento dia 24 de fevereiro.");
                System.out.println("Vencimento dia 28 de março.");
                break;
            case 3:
                System.out.println("Vencimento dia 26 de janeiro.");
                System.out.println("Vencimento dia 25 de fevereiro.");
                System.out.println("Vencimento dia 29 de março.");
                break;
            case 4:
                System.out.println("Vencimento dia 27 de janeiro.");
                System.out.println("Vencimento dia 3 de março.");
                System.out.println("Vencimento dia 4 de abril.");
                break;
            case 5:
                System.out.println("Vencimento dia 28 de janeiro.");
                System.out.println("Vencimento dia 4 de março.");
                System.out.println("Vencimento dia 5 de abril.");
                break;
            case 6:
                System.out.println("Vencimento dia 31 de janeiro.");
                System.out.println("Vencimento dia 7 de março.");
                System.out.println("Vencimento dia 6 de abril.");
                break;
            case 7:
                System.out.println("Vencimento dia 1º de fevereiro.");
                System.out.println("Vencimento dia 8 de março.");
                System.out.println("Vencimento dia 7 de abril.");
                break;
            case 8:
                System.out.println("Vencimento dia 2 de fevereiro.");
                System.out.println("Vencimento dia 9 de março.");
                System.out.println("Vencimento dia 8 de abril.");
                break;
            case 9:
                System.out.println("Vencimento dia 3 de fevereiro.");
                System.out.println("Vencimento dia 10 de março.");
                System.out.println("Vencimento dia 11 de abril.");
                break;
			default:
				System.out.println("Vencimento sem data, desculpe");		
		}
			
	}

}