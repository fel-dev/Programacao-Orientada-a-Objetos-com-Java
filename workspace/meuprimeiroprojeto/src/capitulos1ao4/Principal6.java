package capitulos1ao4;
public class Principal6 {
    public static void main(String[] args) {

        Integer i1 = 127; // Cria um objeto Integer com o valor 127. Como esse valor está dentro do range
                          // de valores do cache interno dos objetos Integer, ambos os objetos i1 e i2
                          // apontam para a mesma instância de objeto Integer
        Integer i2 = 127; 

        Integer i3 = 128; // Cria um objeto Integer com o valor 128. Como esse valor está fora do range de
                          // valores do cache interno dos objetos Integer, o Java cria uma nova instância
                          // de objeto Integer para representar esse valor
        Integer i4 = 128; 

        // Imprime true, pois i1 e i2 apontam para a mesma instância de objeto Integer.
        System.out.println(i1 == i2);        
        System.out.println(i3 == i4);
        // Imprime false, pois i3 e i4 são instâncias diferentes de objetos Integer com o mesmo valor;
        // Cache interno de valores comuns das classes wrapper do Java é utilizado para melhorar a eficiência da aplicação; e
        // Char \u0000 a \u007f (0 a 127) são armazenados no cache interno de valores comuns das classes wrapper do Java.
        

        // Para comparar variáveis usa-se valor1.equals(valor2);
        System.out.println(i1.equals(i2));
        System.out.println(i3.equals(i4)); 

        int x = i1; // Unboxing: processo inverso ao autoboxing (conversão de um valor primitivo para um objeto wrapper) ex: Integer i = 10;
        System.out.println("unboxing " + x);
        // O Java faz o unboxing automaticamente quando um objeto wrapper é usado em um contexto que exige um valor primitivo.
        // Entretanto, isso pode afetar a performance da aplicação em microssegundos, pois o Java precisa fazer a conversão de tipos toda vez que o objeto wrapper é usado.
    }
}
