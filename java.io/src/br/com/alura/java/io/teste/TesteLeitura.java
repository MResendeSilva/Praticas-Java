package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com um arquivo
		InputStream fis = new FileInputStream("teste.txt"); // Cria o fluxo de caracteres porém em binário
		Reader isr = new InputStreamReader(fis); // Passa os dados binarios para caractere
		BufferedReader br = new BufferedReader(isr); // passa os caracteres para string e abre o fluxo de saída

		String linha = br.readLine(); // vai ler a linha do fluxo --- nesse caso a primeira linha ou retorna null

		while (linha != null) {

			System.out.println(linha); // printa as linhas == saida
			linha = br.readLine();

		} // agora lemos todas as linhas

		br.close(); // fecha o fluxo de saida
	}
}
