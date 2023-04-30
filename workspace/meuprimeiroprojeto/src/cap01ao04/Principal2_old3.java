package cap01ao04;
public class Principal2_old3 {
    public static void main(String[] args) { // Aula 3.9 Variáveis referenciam objeto (IPC!!!!!!!!!!!)
        Proprietario dono1 = new Proprietario();
        dono1.nome = "João";

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Palio";

        meuCarro.dono = dono1; // meuCarro.dono é uma variável do tipo Proprietario. Então ela pode receber um objeto do tipo Proprietario. E dono1 é um objeto do tipo Proprietario. Então é possível fazer essa atribuição.

        System.out.println("meuCarro.dono.nome: " + meuCarro.dono.nome); // João
        System.out.println("dono1.nome: " + dono1.nome); // João

        meuCarro.dono.nome = "Maria Joaquina"; // Isso precisa ficar bem claro. É REFERÊNCIA AO MESMO OBJETO que está sendo modificado. Então se eu fizer isso, o dono1 TAMBÉM vai ser modificado.
        System.out.println("\n====================\n");

        System.out.println("meuCarro.dono.nome: " + meuCarro.dono.nome); // Maria Joaquina
        System.out.println("dono1.nome: " + dono1.nome); // Maria Joaquina
        
        // mais claro ainda, pra não ter dúvida: NÃO É UMA CÓPIA. É O PRÓPRIO. É O MESMO OBJETO.
        System.out.println("\n\n\n=================================\nmais claro ainda, pra não ter dúvida: NÃO É UMA CÓPIA. É O PRÓPRIO. É O MESMO OBJETO.");
        Carro seuCarro = new Carro();
        seuCarro.modelo = "Voyage";

        meuCarro.dono = dono1;
        seuCarro.dono = dono1;

        System.out.println("Antes da mudança: ");
        System.out.println("meuCarro.dono.nome: " + meuCarro.dono.nome); // Maria Joaquina
        System.out.println("seuCarro.dono.nome: " + seuCarro.dono.nome); // Maria Joaquina
        System.out.println("dono1.nome: " + dono1.nome); // Maria Joaquina

        System.out.println();

        meuCarro.dono.nome = "Seu Madruga";

        System.out.println("Depois da mudança: ");
        System.out.println("meuCarro.dono.nome: " + meuCarro.dono.nome); // Seu Madruga
        System.out.println("seuCarro.dono.nome: " + seuCarro.dono.nome); // Seu Madruga
        System.out.println("dono1.nome: " + dono1.nome); // Seu Madruga


    }
}
