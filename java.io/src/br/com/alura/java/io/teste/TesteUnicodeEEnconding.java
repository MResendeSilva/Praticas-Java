package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEnconding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "C";
		System.out.println(s.codePointAt(0)); // Como java trabalha com unicode por baixa dos panos, podemos exibir o
												// codepoint de um char

		Charset cs = Charset.defaultCharset(); // Puxando enconding do que o Java esta utilizando

		System.out.println(cs.displayName()); // Pedindo para printar o enconding

		byte[] bytes = s.getBytes("UTF-8"); // FORÇANDO UTILIZAÇÃO DO ENCONDING para saber quantos bytes tem esse char
		System.out.println(bytes.length + ", UTF-8");
		
		String sNovo = new String(bytes, "UTF-8"); // Forçando string a aceitaar aqle byte e traduzir com um charset expecifico
		System.out.println(sNovo);
		
		

		bytes = s.getBytes("UTF-16"); // FORÇANDO UTILIZAÇÃO DO ENCONDING
		System.out.println(bytes.length + ", UTF-16");
		
		bytes = s.getBytes(StandardCharsets.US_ASCII); // FORÇANDO UTILIZAÇÃO DO ENCONDING ASCII
		System.out.println(bytes.length + ", ASCII");
	}
}
