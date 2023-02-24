package sptech.methods;

/**
 *
 * @author ferna
 */
// Evitar colocar print do retorno dentro do proprio metodo
// Isso pode fazer com que você esqueça de usar o retorno
public class Calculadora {

    Integer somar(Integer numero01, Integer numero02) {
        return numero01 + numero02;
    }

    Integer subtrair(Integer numero01, Integer numero02) {
        return numero01 - numero02;
    }

    Integer multiplicar(Integer numero01, Integer numero02) {
        return numero01 * numero02;
    }

    Integer dividir(Integer numero01, Integer numero02) {
        return numero01 / numero02;
    }

    Boolean isPar(Double numeroVerificar) {
        Boolean isPar;
//        if(numeroVerificar % 2 == 0) {
//            isPar = true;
//        } else {
//            isPar = false;
//        }
//    }
        isPar = numeroVerificar % 2 == 0;
        return isPar;
    }

    // Sobrecarga
    // Argumentos diferentes, sem considerar o nome
    Integer somar(Integer numero01, Integer numero02, Integer numero03) {
        return numero01+numero02+numero03;
    }
}
