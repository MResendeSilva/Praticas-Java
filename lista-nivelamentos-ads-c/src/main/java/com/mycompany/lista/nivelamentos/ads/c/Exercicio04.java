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
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner produto = new Scanner(System.in);
        
        System.out.println("Informe o valor unitário do produto");
        Double valorUnitario = produto.nextDouble();
        System.out.println("Informe a quantidade vendida");
        Double quantidadeVendida = produto.nextDouble();
        System.out.println("Informe o valor pago pelo cliente");
        Double valorPago = produto.nextDouble();
        Double vendaTotal = valorUnitario * quantidadeVendida;
        Double troco = valorPago - vendaTotal;
        System.out.println("Seu troco será de R$ " + troco);
    }
}
