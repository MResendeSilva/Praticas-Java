/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.nivelamentos.ads.c;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner auxilio = new Scanner(System.in);

        System.out.println("Informe quantos filhos você tem entre 0 a 3 anos!");
        Integer zeroaTres = auxilio.nextInt();
        System.out.println("Informe quantos filhos você tem entre 4 a 16 anos!");
        Integer quatroaDezesseis = auxilio.nextInt();
        System.out.println("Informe quantos filhos você tem entre 17 a 18 anos!");
        Integer dezesseteMais = auxilio.nextInt();
        Double crianca = 25.12 * zeroaTres;
        Double adolescente = 15.88 * quatroaDezesseis;
        Double maiordeIdade = 12.44 * dezesseteMais;
        Integer totalFilhos = zeroaTres + quatroaDezesseis + dezesseteMais;
        Double totalAuxilio = crianca + adolescente + maiordeIdade;
        System.out.println("\"Você tem um total de " + totalFilhos + " filhos e vai receber"
                + " R$ " + totalAuxilio + " de bolsa ");
    }
}
