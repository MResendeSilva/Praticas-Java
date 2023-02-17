package com.mycompany.lista.de.nivelamento.adsc;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author ferna
 */
public class Loteria {

    public static void main(String[] args) {
        Scanner sorteio = new Scanner(System.in);

        Integer numeroDigitado;
        Integer numeroAleatorio;
        int contador = 0;

        do {
            System.out.println("Insira um número entre 0 e 10");
            numeroDigitado = sorteio.nextInt();

        } while (numeroDigitado < 0 || numeroDigitado > 10);

        do {
            System.out.println("Realizando sorteio");
            numeroAleatorio = ThreadLocalRandom.current().nextInt(1,11);
            contador++;
        } while (!numeroAleatorio.equals(numeroDigitado));

        if (contador <= 3) {
            System.out.println("Você é MUITO sortudo");
            System.out.println(
                    String.format("Acertou o número com apenas %d sorteio(s)", contador));

        } else if (contador <= 10) {
            System.out.println("Você é sortudo");
            System.out.println(
                    String.format("Acertou o número com apenas %d sorteio(s)", contador));
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
            System.out.println(
                    String.format("Acertou o número com apenas %d sorteio(s)", contador));
        }
    }
}
