package com.algaworks.cap7.exemplo_xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.algaworks.cap7.exemplo_xml.modelo.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

public class LendoProduto {
	
	public static void main(String[] args) throws FileNotFoundException {
		XStream xstream = new XStream(new DomDriver());
		xstream.addPermission(AnyTypePermission.ANY);
		xstream.alias("produto", Produto.class);
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		
		
		Produto p = (Produto) xstream.fromXML(new FileInputStream("workspace/meuprimeiroprojeto/src/com/algaworks/cap7/exemplo_xml/produto2.xml"));
		
		System.out.println(p.getCodigo());
		System.out.println(p.getDescricao());
		System.out.println(p.getValor());
	}
}
