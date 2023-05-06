package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TestePrintStreamPrintWriter {
	public static void main(String[] args) throws IOException {
		
		
		
		// Fluxo de entrada com um arquivo
//		OutputStream ois = new FileOutputStream("teste2.txt"); // Cria o fluxo de caracteres porém em binário
//		Writer osw = new OutputStreamWriter(ois); // Passa os dados binarios para caractere
//		BufferedWriter bw = new BufferedWriter(osw); // passa os caracteres para string e abre o fluxo de saída
		
//		FileWriter fw = new FileWriter("Teste2.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("Teste2")); // Pode ser feito em uma linha só passando o fw como construtor
		
		//PrintStream ps = new PrintStream("Teste2.txt");
//		PrintStream ps = new PrintStream(new File("Teste2.txt"));
		
		PrintWriter ps = new PrintWriter("Teste2.txt");
		ps.println("Testando mais uma vez");
		ps.println();
		ps.println("final");
		
		
		ps.close(); // fecha o fluxo de saida
	}
}
