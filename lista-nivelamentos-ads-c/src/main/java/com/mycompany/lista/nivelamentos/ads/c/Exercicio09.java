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
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);
        
        System.out.println("Insira o seu nome");
        String nome = idade.nextLine();
        System.out.println("Olá, "+nome+" Qual o ano do seu nascimento?");
        Integer ano = idade.nextInt();
        Integer idadeFutura = 2030 - ano;
        System.out.println("Em 2030 você terá " + idadeFutura + " anos");
    }
}
