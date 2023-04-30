package capitulos1ao4;
public class Carro {
    
    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao; // int e cia são sempre inicializados com 0. Booleanos são inicializados com false. Strings são inicializadas com null.
    boolean biCombustivel;

    Proprietario dono;

    void ligarAgora() {
        if (modelo != null) {
            System.out.println("Ligando o carro " + modelo + " agora! Vruumm");
        }
    }

    public void alterarModelo(String modelo) {
        if (modelo != null) {
            // modelo = modelo;
            this.modelo = modelo; // this é uma referência ao próprio objeto. É como se fosse um ponteiro para o objeto. Então, quando usamos this, estamos dizendo que queremos acessar o atributo modelo do objeto que está sendo referenciado por this. Ou seja, estamos dizendo que queremos acessar o atributo modelo do objeto que está sendo referenciado por this. Ou seja, estamos dizendo que queremos acessar o atributo modelo do objeto que está sendo referenciado por this. Ou seja, estamos dizendo que queremos acessar o atributo modelo do objeto que está sendo referenciado por this. Ou seja, estamos dizendo que queremos acessar o atributo modelo do objeto que está sendo referenciado por this. Ou seja, estamos dizendo que queremos acessar o atributo modelo do objeto que está sendo referenciado por this. Ou seja, estamos dizendo que queremos acessar o atributo modelo do objeto que está sendo referenciado por this. Se você não entender: leia novamente.
        }
    }

    // Proprietario dono; // relacionamento do tipo "tem um"
    // Proprietario dono = new Proprietario(); // conceitualmente isso pode não fazer sentido. Pq nem todo carro já sai de fabrica com dono, ele fica lá na loja e tals. Então temos que tomar cuidado com isso. Mas é uma forma de inicializar o objeto. Se não fizermos isso, teremos um erro de NullPointerException.
}
