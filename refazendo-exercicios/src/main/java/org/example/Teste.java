package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Teste {
    public static void main(String[] args) {
        // Tentativa de criar um regex de número de telefone

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println(retornaUmRegex(numbers));

    }

    public static String retornaUmRegex(int[] numbers) {
        return Arrays.stream(numbers).mapToObj(n -> String.valueOf((int) n))
                .collect(Collectors.joining())
                .substring(0,10)
                .replaceAll("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3");
    }
}
