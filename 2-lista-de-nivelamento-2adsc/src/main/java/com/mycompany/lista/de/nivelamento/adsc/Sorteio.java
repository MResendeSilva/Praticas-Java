package com.mycompany.lista.de.nivelamento.adsc;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author ferna
 */
public class Sorteio {

    public static void main(String[] args) {
        Scanner sorteio = new Scanner(System.in);
        Integer numeroSorteio;
        Integer posicao = 0;
        Boolean numeroJaSorteado = false;
        Integer contadorImpares = 0;
        Integer contadorPares = 0;

        System.out.println("Insira um número de 1 a 100");
        Integer numeroInserido = sorteio.nextInt();

        for (int i = 1; i < 200; i++) {
            numeroSorteio = ThreadLocalRandom.current().nextInt(1, 101);

            if (numeroSorteio.equals(numeroInserido)
                    && numeroJaSorteado.equals(false)) {
                numeroJaSorteado = true;
                posicao = i;
            }
            if (numeroSorteio % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        System.out.println(String.format("Posição do número "
                + "escolhido foi %d", posicao));
        System.out.println(
                String.format("Foram sorteados %d números pares", contadorPares));
        System.out.println(
                String.format("Foram sorteados %d números impares", contadorImpares));

    }

}
