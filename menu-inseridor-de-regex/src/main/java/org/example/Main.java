package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Regex regex = new Regex();

        int escolha = 0;
        String var = "";

        do {
            regex.plotarMenu();
            escolha = leitor.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite seu CNPJ sem traços, pontos ou barras!");
                    leitor.nextLine();
                    var = leitor.nextLine();
                    regex.pularLinha();
                    System.out.print(regex.retornarComUmaMascaraCnpj(var));
                    regex.pularLinha();
                    break;
                case 2:
                    System.out.println("Digite seu CPF sem traços, pontos ou barras!");
                    leitor.nextLine();
                    var = leitor.nextLine();
                    regex.pularLinha();
                    System.out.print(regex.retornarComUmaMascaraCpf(var));
                    regex.pularLinha();
                    break;
                case 3:
                    System.out.println("Digite seu CEL sem traços, pontos ou barras!");
                    leitor.nextLine();
                    var = leitor.nextLine();
                    regex.pularLinha();
                    System.out.print(regex.retornarComUmaMascaraCel(var));
                    regex.pularLinha();
                    break;
                case 0 :
                    System.out.println("Encerrando programa");
                    break;
                default:
                    System.out.println("Valor inserido é inválido!");
                    break;
            }
        } while (escolha != 0);
        System.out.println("Programa encerrado!");
    }
}
