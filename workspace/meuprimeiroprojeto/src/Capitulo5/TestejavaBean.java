package capitulo5;

public class TestejavaBean {
    public static void main(String[] args) {
        PessoaBean pessoa = new PessoaBean();
        pessoa.setNome("João");
        pessoa.setIdade(20);
        System.out.println("Pessoa " + pessoa.getNome() + " tem " + pessoa.getIdade() + " anos.");
        
    }
}
