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
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner elevador = new Scanner(System.in);
        
        System.out.println("Informe o limite de peso do elevador");
        Double limitePeso = elevador.nextDouble();
        System.out.println("Informe o limite de pessoas do elevador");
        Integer limitePessoa = elevador.nextInt();
        System.out.println("Informe o peso da 1º pessoa que entrou no elevador");
        Double pessoa1 = elevador.nextDouble();
        System.out.println("Informe o peso da 2º pessoa que entrou no elevador");
        Double pessoa2 = elevador.nextDouble();
        System.out.println("Informe o peso da 3º pessoa que entrou no elevador");
        Double pessoa3 = elevador.nextDouble();
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem "
                +limitePessoa+" pessoas.\n" +
"O peso total no elevador é de "+(pessoa1+pessoa2+pessoa3)+", "
        + "sendo que ele suporta "+limitePeso);
    }
}
