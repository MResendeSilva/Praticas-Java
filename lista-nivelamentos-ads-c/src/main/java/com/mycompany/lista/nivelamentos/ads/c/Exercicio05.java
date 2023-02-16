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
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);
        
        System.out.println("Informe um número");
        Double n1 = calculadora.nextDouble();
        System.out.println("Informe um segundo número");
        Double n2 = calculadora.nextDouble();
        System.out.println("Resultado da soma é: " + (n1+n2));
        System.out.println("Resultado da subtração é: " + (n1-n2));
        System.out.println("Resultado da multiplicação é: " + (n1*n2));
        System.out.println("Resultado da divisão é: " + (n1/n2));
    }
}
