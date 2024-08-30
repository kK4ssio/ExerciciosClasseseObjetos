//exercicio 3: classe carro.
package exerciciosclasseseobjetos;

/**
 *
 * @author Kassio Dias Monteiro
 */
public class Ex3Carro {

    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public Ex3Carro(String marca, String modelo, int ano, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void InfosVeiculo() {
        System.out.println("MARCA: " + marca + "  MODELO: " + modelo + "  ANO: " + ano + "  VELOCIDADE: " + velocidade);
    }
}
