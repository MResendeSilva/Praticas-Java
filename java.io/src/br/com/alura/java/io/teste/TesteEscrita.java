package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com um arquivo
		OutputStream ois = new FileOutputStream("teste2.txt"); // Cria o fluxo de caracteres porém em binário
		Writer osw = new OutputStreamWriter(ois); // Passa os dados binarios para caractere
		BufferedWriter bw = new BufferedWriter(osw); // passa os caracteres para string e abre o fluxo de saída
		
		bw.write("Apenas um teste, podemos utilizar isso para fazer relatórios na sprint");
		bw.newLine();
		bw.newLine();
		bw.write("Nós acabamos de pular duas linhas utilizando o bw newline");
		
		bw.close(); // fecha o fluxo de saida
	}
}
