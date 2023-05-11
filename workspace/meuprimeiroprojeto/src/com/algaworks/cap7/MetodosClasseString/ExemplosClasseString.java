package com.algaworks.cap7.MetodosClasseString;

public class ExemplosClasseString {

	public static void main(String[] args) {
		String nome = "Pedro";
		System.out.println(nome.toUpperCase());
		System.out.println(nome);

		nome = nome.toUpperCase();
		System.out.println(nome);

		System.out.println("-------------------------------------------------");

		String s1 = "Pedro";
		String s2 = "Pedro";

		System.out.println("\ns1 == " + s1 + "\ns2 == " + s2);
		System.out.println("s1 == s2? " + (s1 == s2));

		String s3 = new String("Pedro");

		System.out.println("\ns3 == " + s3);
		System.out.println("s3 == s1? " + (s3 == s1) + "\n");

		System.out.println("s1.equals(s2)? " + (s1.equals(s2)));
		System.out.println("s3.equals(s1)? " + (s3.equals(s1)));

		String s4 = "PeDrO";

		System.out.println("\ns4 == " + s4 + "\n");

		System.out.println("s1.equals(s4)? " + (s1.equals(s4)));
		System.out.println("s1.equalsIgnoreCase(s4)? " + (s1.equalsIgnoreCase(s4)));
	}

}
