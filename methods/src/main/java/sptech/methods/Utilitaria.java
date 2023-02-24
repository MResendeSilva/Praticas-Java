package sptech.methods;

/**
 *
 * @author ferna
 */
public class Utilitaria {
    //  Retorno: esse não tem, é void!!
    //  Nome: exibirLinha (camelCase = variavel)
    //  Argumentos: Não tem, fica dentro dos parenteses
    //  Corpo:  Fica dentro das chaves

    void exibirLinha() {
        System.out.println("*--------*--------*");
    }

    // Metodo com argumento:
    void exibirNome(String nomeExibir) {
        System.out.println(String.format("Meu nome é %s", nomeExibir));
    }

    // Metodos diferentes podem ter arguementos com mesmo nome
    // Já que nascem e morrem dentro do metodo
    void exibirNomeFormatado(String nomeExibirFormatado) {
        exibirLinha();
        exibirNome(nomeExibirFormatado);
        exibirLinha();
        System.out.println("\n");
    }

}
