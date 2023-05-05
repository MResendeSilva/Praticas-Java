package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Regex {

    public void plotarMenu() {
        System.out.println("""
                                
                ------------------------------------------
                |    Bem - vindo(a) ao teste de regex    |            
                ------------------------------------------
                | 1 - Teste de CNPJ                      |
                |                                        |
                | 2 - Teste de CPF                       |
                |                                        |
                | 3 - Teste de Celular                   |
                |                                        |
                | 0- Sair                                |
                |-----------------------------------------
                                
                """);
    }

    public void pularLinha() {
        System.out.println("");
    }

    public String retornarComUmaMascaraCnpj(String numbers) {
        if (numbers != null) {
            return numbers.chars().mapToObj(n -> String.valueOf((char) n))
                    .collect(Collectors.joining()).substring(0, 14)
                    .replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");

        } else {
            return "CNPJ inserido de forma incorreta!";
        }
    }

    public String retornarComUmaMascaraCpf(String numbers) {
        if (numbers != null) {
            return numbers.chars().mapToObj(n -> String.valueOf((char) n))
                    .collect(Collectors.joining()).substring(0, 11)
                    .replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        } else {
            return "CPF inserido de forma incorreta!";
        }
    }

    public String retornarComUmaMascaraCel(String numbers) {
        if (numbers != null) {
            return numbers.chars().mapToObj(n -> String.valueOf((char) n))
                    .collect(Collectors.joining()).substring(0, 11)
                    .replaceAll("(\\d{2})(\\d{5})(\\d{4})", "($1) $2-$3");

        } else {
            return "Número inserido de forma incorreta!";
        }
    }


}
