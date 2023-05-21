import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//7.16. Parâmetros da JVM
// https://app.algaworks.com/aulas/478/parametros-da-jvm
public class Memoria { // no terminal> jconsole 

    List<Object> lista = new ArrayList<>();

    public static void main(String[] args) {
        Memoria memoria = new Memoria();
        
        try (Scanner entrada = new Scanner(System.in)) {
            int opcao = 0;
            do {
                System.out.print("Informe uma opção: ");
                opcao = entrada.nextInt();

                if (opcao == 1 ) {
                    for (int i = 0; i < 5_000_000; i++) {
                        memoria.lista.add(new Object());
                    }
                }
            } while (opcao != 0);
        }
    }
}
/* Run Configuration > Java Application > Memoria > Arguments
 * -Xms 1300 -Xmx1300 -XX:MaxPermSize=128m (se tiver muitas classes é a pern gen ñ tem mais no java 8, chama-se metaspace)
 */
