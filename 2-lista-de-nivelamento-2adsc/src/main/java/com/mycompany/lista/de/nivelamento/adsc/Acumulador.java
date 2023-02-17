package com.mycompany.lista.de.nivelamento.adsc;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author ferna
 */
public class Acumulador {

    public static void main(String[] args) {
        Scanner acumulador = new Scanner(System.in);
        Integer numeroInserido;
        Integer soma = 0;

        do {
            System.out.println("Insira um número");
            numeroInserido = acumulador.nextInt();
            soma += numeroInserido;
        } while (!numeroInserido.equals(0));

        System.out.println(String.format("A soma dos números é %d", soma));
    }
}
