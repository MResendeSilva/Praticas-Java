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
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Informe o seu login: ");
        String login = user.nextLine();
        System.out.println("Informe sua senha: ");
        String senha = user.nextLine();
        System.out.println("Informe quantas vezes a conta será bloqueada "
                + "após erro");
        Integer quantidade = user.nextInt();
        System.out.println("Seu login é " + login + " e sua senha é " + senha + ". "
                + "Você tem " + quantidade
                + " tentativas antes de ser bloqueado\"");
    }
}
