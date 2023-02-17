package com.mycompany.lista.de.nivelamento.adsc;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Votacao {

    public static void main(String[] args) {
        Scanner sabor = new Scanner(System.in);
        Integer votoMussarela = 0;
        Integer votoCalabresa = 0;
        Integer votoQuatroQueijos = 0;
        String vencedor;
        Integer rodada = 0;

        do {
            System.out.println("Digite o código do seu sabor favorito \n"
                    + "sendo eles: mussarela: 5; calabresa: 25; quatro-queijos: 50");
            Integer voto = sabor.nextInt();

            switch (voto) {
                case 5:
                    votoMussarela++;
                    break;

                case 25:
                    votoCalabresa++;
                    break;

                case 50:
                    votoQuatroQueijos++;
                    break;
            }
            rodada++;
        } while (rodada < 10);

        if (votoMussarela == 5 && votoCalabresa == 5 || votoMussarela == 5
                && votoQuatroQueijos == 5 || votoQuatroQueijos == 5
                && votoCalabresa == 5) {
            vencedor = "empate! Sem vencedor!";
        } else if (votoMussarela >= 4) {
            vencedor = "O sabor vencedor é mussarela";
        } else if (votoCalabresa >= 4) {
            vencedor = "O sabor vencedor é calabresa";
        } else {
            vencedor = "O sabor vencedor é quatro queijos";
        }

        System.out.println(String.format(
                "Apuração de votos!\n"
                + "Mussarela: %d\n"
                + "Calabresa: %d\n"
                + "Quatro queijos: %d\n", votoMussarela, votoCalabresa,
                votoQuatroQueijos));

        System.out.println(
                String.format("%s", vencedor));
    }
}
