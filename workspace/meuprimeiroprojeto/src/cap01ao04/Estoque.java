package cap01ao04;
import cap05.*;

    class Estoque {
    
        Produto[] produtos;

        void listarProdutos() {

            System.out.println("\nProdutos em estoque:");
            System.out.println("--------------------");
            for (int i = 0; i < produtos.length; i++) {
                produtos[i].descrever();
            }
        }

        // graça: calcular o total de itens em estoque
        int calcularQuantidadeTotal() {
            int quantidadeTotal = 0;
            for (int i = 0; i < produtos.length; i++) {
                quantidadeTotal += produtos[i].quantidade;
            }
            return quantidadeTotal;
        }
}

//Além do atributo "produtos", criamos também um método "listarProdutos", que percorrerá o array de produtos e mostrará na tela item por item.
