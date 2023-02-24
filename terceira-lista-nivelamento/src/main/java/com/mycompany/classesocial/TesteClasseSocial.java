package com.mycompany.classesocial;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class TesteClasseSocial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Calculadora calcSocial = new Calculadora();

        System.out.println("Digite sua renda:");
        Double rendaInserida = leitor.nextDouble();

        Double resultado01 = calcSocial.calcularNumeroSalarioMinimo(rendaInserida);
        System.out.println(
                String.format("Você recebe aproximadamente %.2f salários"
                        + "-mínimos", resultado01));

        String classeSocial = calcSocial.identificarClasseSocial(resultado01);

        System.out.println(
                String.format("Sua classe social é: %s", classeSocial));

    }
}
