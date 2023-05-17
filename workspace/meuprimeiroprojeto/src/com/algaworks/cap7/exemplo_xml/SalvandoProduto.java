package com.algaworks.cap7.exemplo_xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;

import com.algaworks.cap7.exemplo_xml.modelo.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class SalvandoProduto {

	public static void main(String[] args) throws FileNotFoundException {
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto", Produto.class); // apelido para ñ usar o nome completo da classe
		
		// novo produto
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		

		Produto sabonete = new Produto(1L, "sabonete", new BigDecimal("2.30"));

		String xml = xstream.toXML(sabonete);
		System.out.println(xml);

		// mandar pra um arquivo
		OutputStream os = new FileOutputStream("workspace\\meuprimeiroprojeto\\src\\com\\algaworks\\cap7\\exemplo_xml\\produto2.xml");
		xstream.toXML(sabonete, os);
	}
}
