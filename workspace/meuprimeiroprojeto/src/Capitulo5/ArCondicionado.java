package Capitulo5;

public class ArCondicionado {

    private int temperatura; // está privado o atributo, ningém pode acessar diretamente do lado de fora da classe

    public void trocarTemperatura(int temperatura){
        if (temperatura >= 17 && temperatura <= 25){
            this.temperatura = temperatura;
        }
    }

    public int obterTemperatura(){
        return this.temperatura;
    }
}
