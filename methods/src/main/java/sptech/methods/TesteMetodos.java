package sptech.methods;

/**
 *
 * @author ferna
 */
public class TesteMetodos {

    public static void main(String[] args) {
        // Para utilizar os metodos das classes, precisamos criar objetos
        // Ou seja, fazer uma instancia (usar a palavra new)

        Utilitaria util = new Utilitaria(); // Objeto do tipo utilitaria
        Calculadora calc = new Calculadora();

        String nome01 = "Xampson";
        String nome02 = "Mateus";

        util.exibirNomeFormatado(nome01);
        util.exibirNomeFormatado(nome02);

        System.out.println("Soma:");

        Integer resultadoSoma = calc.somar(10, 32);
        System.out.println("Retorno com variavel " + resultadoSoma);
        System.out.println("Direto no print: " + calc.somar(10, 32));
        
        
        System.out.println("Subtrair:");
        Integer resultadoSubtracao = calc.subtrair(10,10);
        System.out.println(resultadoSubtracao);
        
        System.out.println("Multiplicar:");
        Integer resultadoMultiplicacao = calc.multiplicar(10,10);
        System.out.println(resultadoMultiplicacao);
        
        System.out.println("Divisao:");
        Integer resultadoDivisao = calc.dividir(10,10);
        System.out.println(resultadoDivisao);
        
        calc.somar(resultadoSoma, resultadoSoma, resultadoSoma);
    }
}
