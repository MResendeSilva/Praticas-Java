package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;
import java.util.Arrays;

public class TesteDeAtributos {
    private static final LocalDateTime dataHora = LocalDateTime.now();
    private final String dataHoraFormatada = dataHora.format(DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss"));

    public void gerarArquivo(Exception erro) throws IOException {
        System.out.println("Método gerar arquivo foi chamado!!!");

        String nomeDoArquivo = formularNomeDoArquivoLog(erro);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeDoArquivo))) {
            erro.printStackTrace(new java.io.PrintWriter(bw));
            // Crio esse print writter para tansformar o stacktrace em uma string e escrever no Buffered writter

            bw.newLine();
            bw.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String formularNomeDoArquivoLog(Exception ex) {
        String mensagem = ex.getMessage();
        String nomeArquivo = dataHoraFormatada + "_" + mensagem;
        return nomeArquivo.replaceAll("[^a-zA-Z0-9-_]", "_");
    }

}
