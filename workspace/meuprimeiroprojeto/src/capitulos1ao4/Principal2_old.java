package capitulos1ao4;
public class Principal2_old {
public static void main(String[] args) {
    Proprietario dono1 = new Proprietario();
    dono1.nome = "João da Silva";
    dono1.cpf = "123.456.789-00";
    dono1.idade = 25;
    dono1.logradouro = "Rua das Canárias, 10";
    dono1.bairro = "Centro";
    dono1.cidade = "São Paulo";

    Carro meuCarro = new Carro();
    meuCarro.anoDeFabricacao = 2011;
    meuCarro.cor = "prata";
    meuCarro.fabricante = "Fiat";
    meuCarro.modelo = "Palio";
    meuCarro.dono = dono1;


    // Outra forma de fazer; Atribuindo os dados do dono do carro diretamente no objeto. 
    // meuCarro.dono = new Proprietario();
    // meuCarro.dono.nome = "João da Silva"; // Navegando dentro dos objetos.
    // meuCarro.dono.bairro = "Centro";



    // Imprimindo todos os dados do carro
    System.out.println("Meu carro");
    System.out.println("-------------------");
    System.out.println("Modelo: " + meuCarro.modelo);
    System.out.println("Ano: " + meuCarro.anoDeFabricacao);
    System.out.println("Cor: " + meuCarro.cor);
    System.out.println("Fabricante: " + meuCarro.fabricante);
    System.out.println("Dono: " + meuCarro.dono.nome);
    System.out.println("CPF: " + meuCarro.dono.cpf);
    System.out.println("Idade: " + meuCarro.dono.idade);
    System.out.println("Endereço: " + meuCarro.dono.logradouro + " - " + meuCarro.dono.bairro + " - " + meuCarro.dono.cidade);

    // Imprimindo apenas o nome do dono do carro
    System.out.println("Dono: " + meuCarro.dono.nome);

    // Imprimindo apenas o CPF do dono do carro
    System.out.println("CPF: " + meuCarro.dono.cpf);

    // Imprimindo apenas o endereço do dono do carro
    System.out.println("Endereço: " + meuCarro.dono.logradouro + " - " + meuCarro.dono.bairro + " - " + meuCarro.dono.cidade);



}
}
