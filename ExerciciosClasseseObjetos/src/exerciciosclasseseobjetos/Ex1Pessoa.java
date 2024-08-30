//exercicio 1: classe pessoa.
package exerciciosclasseseobjetos;

/**
 *
 * @author Kassio Dias Monteiro
 */

public class Ex1Pessoa {
//atributos

    private String nome;
    private int idade;
    private String profissao;

//mét.construtor    
    public Ex1Pessoa(String nome, int idade, String profissao) {

        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

//getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

//
    public void Exibicao() {
        System.out.println(nome + " " + idade + " " + profissao);
    }

}
