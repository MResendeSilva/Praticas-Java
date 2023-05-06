package org.example;

import java.io.*;
import java.util.Scanner;

public class TesteEscrita1 {

    public static void main(String[] args) throws IOException {
        TesteDeAtributos t = new TesteDeAtributos();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo_inexistente.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();

        } catch (Exception ex) {
           t.gerarArquivo(ex);
        }

    }
}
