package com.mycompany.lista.de.nivelamento.adsc;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Login {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        
        System.out.println("Informe seu nome de usuário");
        String loginInserido = user.nextLine();
        System.out.println("Informe sua senha");
        String senhaInserida  = user.nextLine();
        
        if (!loginInserido.equals("admin")||
                !senhaInserida.equals("#SPtech2022")) {
            do {
                System.out.println("Login e/ou senha inválidos”");
                System.out.println("Insira o login novamente");
                loginInserido = user.nextLine();
                System.out.println("Insira a senha novamente");
                senhaInserida  = user.nextLine();
            } while (!loginInserido.equals("admin")||
                !senhaInserida.equals("#SPtech2022"));
        }
        System.out.println("Login realizado com sucesso");
    }
}