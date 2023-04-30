package Capitulo5;
// Para ser um Java Bean, os atributos devem ser privados e os métodos públicos
// e é uma classe que os atributos são encapsulados
public class PessoaBean { 
    
    private String nome;
    private int idade;

    // construtor default (opcional)
    public PessoaBean() {

    }

    // getNome() é um método público
    public String getNome() { 
        return nome;
    }
    // setNome() é um método público para modificar o atributo nome
    public void setNome(String nome) { 
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    
}
