package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank.
 *
 * @author Nico Steppat
 * @version 0.1
 */
public class Cliente implements Serializable {

    private static final long serialVersionUID = 9205117266306915548L; // gera e forca apenas uma identificação de memória especifica para o java
    // caso não coloquemos isso, o java ira gerar uma serialização especifica
    // E quando o java recuperar o arquivo do bin, como ele ja fio criado com um tipo de id, ele jogara uma exception de erro de id
	private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
