package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8"); // Escreve linha por linha // Forçando a ler o arquivo em UTF-8

		while (scanner.hasNextLine()) {

			String linha = scanner.nextLine();
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha); // Preciso passar um dica pro scanner analisar e separar a linha
			linhaScanner.useLocale(Locale.US); // Obriga JVM a utilizar regras da localidade que você está
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			Integer valor2 = linhaScanner.nextInt();
			Integer valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			Double valor5 = linhaScanner.nextDouble();
			
			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			linhaScanner.close();

//			String[] valores = linha.split(","); // Devolve um array do tipo String com as strings separadas pelo que estã no construtor
//			System.out.println(Arrays.toString(valores)); //Método static da classe Arrays que transforma o array em uma string
			
				
			
			
		}
		scanner.close();
	}
}
