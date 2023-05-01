package utilitarios;
import javax.sound.sampled.*;
import java.io.*;

public class Console {
  
  // Limpa a tela do console
  public static void Limpar() {
    System.out.print("\033[H\033[2J");  
    System.out.flush(); 
    PularLinha();
  }

  // Limpa a tela do console e imprime uma mensagem
  public static void Limpar(String mensagem) {
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
    System.err.println(mensagem);
    PularLinha();
  }

  // Limpar a tela do console e tocar um som
  public static void LimparEDecolar() throws Exception {
    // Limpa a tela
    Limpar();

    // Mensagem de preparação
    System.err.println("Estou ouvindo um avião decolando...");
    
    // Carrega o arquivo de som
    File somDecolar = new File("I:\\1 - algaworks\\Programacao-Orientada-a-Objetos-com-Java\\bin\\utilitarios\\decolar4.wav");

    // Cria um objeto do tipo Clip
    Clip clip = AudioSystem.getClip();

    // Carrega o arquivo de som no objeto clip
    clip.open(AudioSystem.getAudioInputStream(somDecolar));

    // Toca o som
    clip.start();

    // Espera o som terminar
    Thread.sleep(clip.getMicrosecondLength()/1000);

    // Limpa a tela
    Limpar();

    // Pula uma linha
    PularLinha();
  }

  // Limpar a tela do console e tocar um som e imprimir uma mensagem
  public static void LimparEDecolar(String mensagem) throws Exception {

    // Limpa a tela
    Limpar();

    // Mensagem de preparação
    System.err.println("Estou ouvindo um avião decolando...");

    // Carrega o arquivo de som
    File somDecolar = new File("I:\\1 - algaworks\\Programacao-Orientada-a-Objetos-com-Java\\bin\\utilitarios\\decolar4.wav");

    // Cria um objeto do tipo Clip
    Clip clip = AudioSystem.getClip();

    // Carrega o arquivo de som no objeto clip
    clip.open(AudioSystem.getAudioInputStream(somDecolar));

    // Toca o som
    clip.start();

    // Espera o som terminar
    Thread.sleep(clip.getMicrosecondLength()/1000);

    // Limpa a tela
    Limpar();

    // Imprime a mensagem
    System.err.println(mensagem);

    // Pula uma linha
    PularLinha();
  }


  // Pula uma linha
  public static void PularLinha() {
    System.out.println();
  }

  // Pausa a execução do programa
  public static void Pausar() {
    System.out.println("Pressione qualquer tecla para continuar...");
    try {
      System.in.read();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // 
}


