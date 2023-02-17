package com.mycompany.lista.de.nivelamento.adsc;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Potencia {

    public static void main(String[] args) {
        Scanner potenciacao = new Scanner(System.in);
        Integer base;
        Integer expoente;

        System.out.println("Insira a base da potência (numero inteiro)");
        base = potenciacao.nextInt();
        System.out.println("Insira o expoente da potência (numero inteiro)");
        expoente = potenciacao.nextInt();

        Integer parcial = base;

        if (expoente.equals(0)) {
            parcial = 1;
        } else {
            for (int i = 1; i < expoente; i++) {
                parcial *= base;
            }
        }
        System.out.println(
                String.format("Sua base é %d e seu "
                        + "expoente é %d", base, expoente));
        System.out.println(
                String.format("O resultado é %d", parcial));

    }
}
