//exercicio 7: classe estudante.
package exerciciosclasseseobjetos;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Kassio Dias Monteiro
 */
public class Ex7Estudante {

    private String nome;
    private int idade;
    private List<String> disciplinas;

    public Ex7Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.disciplinas = new ArrayList<>();
    }

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

    public void adicionarDisciplina(String disciplina) {
        disciplinas.add(disciplina);
    }

    public void exibirDisciplinas() {
        System.out.println("NOME DO ALUNO: " + nome + "  IDADE DO ALUNO: " + idade);
        System.out.println("DISCIPLINAS MATRICULADAS:");
        for (String disciplina : disciplinas) {
            System.out.println(disciplina);

        }
    }
}
