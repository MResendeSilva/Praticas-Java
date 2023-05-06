package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivo {
	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket(); // Funciona como telefone.... escuta informações
		
		
		
		// Fluxo de entrada com um arquivo
		// InputStream fis = new FileInputStream("teste.txt"); Cria o fluxo de caracteres porém em binário
		// InputStream fis =     System.in; Agora a pessoa irá escrever algo que será impresso no teste
		InputStream fis = s.getInputStream();
		Reader isr = new InputStreamReader(fis); // Passa os dados binarios para caractere
		BufferedReader br = new BufferedReader(isr); // passa os caracteres para string e abre o fluxo de saída

		
		//OutputStream ois = System.out; Analogo à saída pelo console //new FileOutputStream("teste3.txt");
		OutputStream ois = s.getOutputStream();
		Writer osw = new OutputStreamWriter(ois); 
		BufferedWriter bw = new BufferedWriter(osw); 
		
		String linha = br.readLine();
		
		
		while (linha != null && !linha.isEmpty()) {

			bw.write(linha); // printa as linhas == saida
			bw.newLine();
			bw.flush(); //Faz com que tudo que você escreve ja saí no console
			linha = br.readLine();
		}
		
		br.close();
		bw.close(); // fecha o fluxo de saida e ao fechar é quando o buffer joga tudo que ele guardado e salva no arquivo txt
		// Se colocar o txt como output e tiver o .flush, ele vai alterar de forma instantanea
	}
}
