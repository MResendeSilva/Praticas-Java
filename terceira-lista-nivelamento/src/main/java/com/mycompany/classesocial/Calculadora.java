package com.mycompany.classesocial;

/**
 *
 * @author ferna
 */
public class Calculadora {

    Double calcularNumeroSalarioMinimo(Double rendaInserida) {
        return rendaInserida / 1045.00;
    }

    String identificarClasseSocial(Double numeroSalarioMinimo) {
        String frase;

        if (numeroSalarioMinimo <= 2) {
            frase = "E";
        } else if (numeroSalarioMinimo <= 4) {
            frase = "D";
        } else if (numeroSalarioMinimo <= 10) {
            frase = "C";
        } else if (numeroSalarioMinimo <= 20) {
            frase = "B";
        } else {
            frase = "A";
        }
        return frase;
    }
}
