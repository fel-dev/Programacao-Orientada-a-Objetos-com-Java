package workspace.meuprimeiroprojeto.bin.capitulos1ao4;

import java.nio.charset.StandardCharsets;

public class Exercicio2_10 {
	
	public static void main(String[] args) {
    System.out.println("preço médio das 3 últimas caixas de bombons");
    int preco1 =5;
    int preco2 = 8;
    int preco3 =  12;
    
    int media = (preco1 + preco2 + preco3) / 3;
    
    System.out.println("\\\"Sistema de Calcula de Media\\\"");
    System.out.println("\"Preco 1: " + preco1);
    System.out.println("\"Preco 2: " + preco2);
    System.out.println("\"Preco 3: " + preco3);
    System.out.println("A media é R$" + media);    
	}

}