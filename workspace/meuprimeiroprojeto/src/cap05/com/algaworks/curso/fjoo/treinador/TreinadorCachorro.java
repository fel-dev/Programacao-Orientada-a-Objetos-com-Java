package cap05.com.algaworks.curso.fjoo.treinador;

import cap05.com.algaworks.curso.fjoo.animal.Cachorro; // importar a classe cachorro nome completo!!!
// import com.algaworks.curso.fjoo.animal.*; // importar todas as classes do pacote animal - não gosto, um importe pra cada classe

public class TreinadorCachorro {
    
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Baby");
        
        System.out.println(cachorro.getNome());
    }
}


// 5.8. Organizando os projetos em pacotes https://app.algaworks.com/aulas/70/organizando-os-projetos-em-pacotes