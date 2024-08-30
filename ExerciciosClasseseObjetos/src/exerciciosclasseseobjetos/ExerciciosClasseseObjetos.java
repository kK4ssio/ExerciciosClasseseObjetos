//Lista de Exercicios sobre Classes e Objetos POO2.
//classe principal.
package exerciciosclasseseobjetos;

/**
 *
 * @author Kassio Dias Monteiro
 */
public class ExerciciosClasseseObjetos {

    public static void main(String[] args) {

        //exercicio 1:    
        Ex1Pessoa pessoa1 = new Ex1Pessoa("roberto", 23, "pedreiro");
        pessoa1.Exibicao();

        System.out.println("===================================================");

        //exercicio 2:
        Ex2ContaBancaria conta1 = new Ex2ContaBancaria("João", 10, 2002, "n");
        conta1.mostarInfos();

        System.out.println("===================================================");

        //exercicio3:
        Ex3Carro carro1 = new Ex3Carro("Fiat", "Uno", 2010, 400);
        carro1.InfosVeiculo();

        System.out.println("===================================================");

        //exercicio4:
        Ex4Livro livro1 = new Ex4Livro("O Hobbit", "J.R.R Tolkien", 300, 5);
        livro1.DadosLivro();

        System.out.println("===================================================");

        //exercicio5:
        Ex5Retangulo retangulo1 = new Ex5Retangulo(50, 60);
        retangulo1.CalculaArea();

        System.out.println("===================================================");

        //exercicio6:
        Ex6Contador contador1 = new Ex6Contador(12);
        contador1.Contar();

        System.out.println("===================================================");

        //exercicio7:
        Ex7Estudante estudante1 = new Ex7Estudante("João", 20);
        estudante1.adicionarDisciplina("Matemática");
        estudante1.adicionarDisciplina("História");
        estudante1.adicionarDisciplina("Biologia");

        estudante1.exibirDisciplinas();
    }

}
