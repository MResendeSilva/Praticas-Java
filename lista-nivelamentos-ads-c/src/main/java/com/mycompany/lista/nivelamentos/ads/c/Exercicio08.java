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
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner calculoMedio = new Scanner(System.in);
        
        System.out.println("Informe o nome do aluno");
        String nome = calculoMedio.nextLine();
        System.out.println("Informe a primeira nota do aluno");
        Double n1 = calculoMedio.nextDouble();
        System.out.println("Informe a segunda nota do aluno");
        Double n2 = calculoMedio.nextDouble();
        Double media = (n1+n2) / 2;
        
        System.out.println("Olá, " +nome+ ". Sua média foi de "+media);
    }
}
