package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// Serializando o objeto cliente

//		Cliente cliente = new Cliente();
//		cliente.setNome("Mateus");
//		cliente.setProfissao("Programador");
//		cliente.setCpf("47793426590");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();

		
		
		
		
		
		
		// String nome = "Mateus Resende";

		// Agora vamos transformar o nome em um fluxo de bits e bytes


		// Agora vamos transformar os bits em bytes em string

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject(); // vai ler o objeto e é preciso passar o cast para mostrar o tipo de
													// objeto que deve retornar
		ois.close();
		System.out.println(cliente.getNome());
	}
}
