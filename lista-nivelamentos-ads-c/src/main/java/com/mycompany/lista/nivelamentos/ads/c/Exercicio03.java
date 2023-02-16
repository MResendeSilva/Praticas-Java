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
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner caloria = new Scanner(System.in);

        System.out.println("Informe o tempo, em minutos (tempo inteiro), que você"
                + " se aqueceu");
        Integer tempoAquecimento = caloria.nextInt();
        System.out.println("Informe o tempo, em minutos (tempo inteiro), que você"
                + "fez de exercício aeróbicos");
        Integer tempoAerobico = caloria.nextInt();
        System.out.println("Informe o tempo, em minutos (tempo inteiro), que você"
                + "fez de musculação");
        Integer tempoMusculacao = caloria.nextInt();
        Integer caloriaAquecimento = tempoAquecimento * 12;
        Integer caloriaAerobico = tempoAerobico * 20;
        Integer caloriaMusculacao = tempoMusculacao * 25;
        Integer caloriaTotal = caloriaAquecimento
                + caloriaAerobico + caloriaMusculacao;
        Integer tempoTotal = tempoAquecimento + tempoAerobico + tempoMusculacao;
        System.out.println("Olá, Jorge. Você fez um total de " + tempoTotal + " minutos de exercícios e perdeu cerca de "
                + caloriaTotal + " calorias");
    }
}
