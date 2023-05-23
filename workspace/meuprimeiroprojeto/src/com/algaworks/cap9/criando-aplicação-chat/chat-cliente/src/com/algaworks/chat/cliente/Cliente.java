package com.algaworks.chat.cliente;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.algaworks.chat.cliente.gui.JanelaGui;
// import com.algaworks.chat.cliente.thread.RecebeMensagemServidor;
import com.algaworks.chat.cliente.thread.RecebeMensagemServidor;

public class Cliente extends JanelaGui {

	private Socket socket;
	
	public static void main(String[] args) {
		new Cliente();
	}

	@Override
	protected boolean conectar() {
		System.out.println("Conectando no servidor...");
		try {
			this.socket = new Socket("127.0.0.1", 3333);
			
			RecebeMensagemServidor recebeMensagemServidor = new RecebeMensagemServidor(this.socket, this);// criou o objeto			
			new Thread(recebeMensagemServidor).start(); // inicia a thread que recebe as mensagens do servidor
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	protected void sendMessage(String mensagem) { // TODO mandar um objeto
		System.out.println("Envia a mensagem via socket para o servidor - " + mensagem);
		
		try {
			OutputStream os = this.socket.getOutputStream(); 
			DataOutput dos = new DataOutputStream(os);	
			dos.writeUTF(mensagem);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}