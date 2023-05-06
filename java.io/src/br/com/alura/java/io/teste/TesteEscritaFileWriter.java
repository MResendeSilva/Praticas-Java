package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
	public static void main(String[] args) throws IOException {
		
		
		
		// Fluxo de entrada com um arquivo
//		OutputStream ois = new FileOutputStream("teste2.txt"); // Cria o fluxo de caracteres porém em binário
//		Writer osw = new OutputStreamWriter(ois); // Passa os dados binarios para caractere
//		BufferedWriter bw = new BufferedWriter(osw); // passa os caracteres para string e abre o fluxo de saída
		
//		FileWriter fw = new FileWriter("Teste2.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("Teste2")); // Pode ser feito em uma linha só passando o fw como construtor
		
		bw.write("Apenas um teste, podemos utilizar isso para fazer relatórios na sprint");
		bw.newLine();
		bw.newLine();
		bw.write("Nós acabamos de pular duas linhas utilizando o bw newline");
		
		bw.close(); // fecha o fluxo de saida
	}
}
