package cap05;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado(); // 17 - 25

        ar.trocarTemperatura(21);
        System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "ºC");

        ar.trocarTemperatura(10);
        System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "ºC");
    }
}
