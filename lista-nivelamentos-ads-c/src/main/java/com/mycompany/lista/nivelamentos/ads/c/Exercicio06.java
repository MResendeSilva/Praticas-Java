package com.mycompany.lista.nivelamentos.ads.c;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferna
 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);
        
        System.out.println("Informe seu salário bruto");
        Double salarioBruto = salario.nextDouble();
        Double inss = salarioBruto * 0.1;
        Double ir = salarioBruto * 0.2;
        System.out.println("Quanta é o seu VT?");
        Double vt = salario.nextDouble() * 2 * 22;
        Double salarioLiquido = salarioBruto - inss - ir - vt;
        
        System.out.println("Seu salário bruto é R$ "+salarioBruto+" , tem um "
                + "total de R$ "+(inss+ir+vt)+" em descontos e receberá um" +
"líquido de R$ " + salarioLiquido);
        
    }
}
