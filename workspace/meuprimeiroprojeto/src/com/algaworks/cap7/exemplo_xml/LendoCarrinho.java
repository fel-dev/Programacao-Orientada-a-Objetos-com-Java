package com.algaworks.cap7.exemplo_xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import com.algaworks.cap7.exemplo_xml.modelo.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

public class LendoCarrinho {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		XStream xstream = new XStream(new DomDriver());
		xstream.addPermission(AnyTypePermission.ANY);
		xstream.alias("produto", Produto.class);
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		xstream.alias("carrinho", List.class);	

		
		List<Produto> carrinho = (List<Produto>) xstream.fromXML(new FileInputStream("workspace/meuprimeiroprojeto/src/com/algaworks/cap7/exemplo_xml/carrinho.xml")); // fica dando warning por causa dos generics
		for (Produto produto : carrinho) {
			System.out.println(produto.getCodigo());
			System.out.println(produto.getDescricao());
			System.out.println(produto.getValor());
		}
	}

}
