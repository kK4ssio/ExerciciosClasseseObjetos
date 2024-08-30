//exercicio 5: classe retangulo
package exerciciosclasseseobjetos;

/**
 *
 * @author Kassio Dias Monteiro
 */
public class Ex5Retangulo {

    private int Altura;
    private int Base;

    public Ex5Retangulo(int Altura, int Base) {
        this.Altura = Altura;
        this.Base = Base;

    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public int getBase() {
        return Base;
    }

    public void setBase(int Base) {
        this.Base = Base;
    }

    public void CalculaArea() {
        int AreaTotal = Base * Altura;

        System.out.println("ALTURA: " + Altura + "  LARGURA: " + Base + "  AREA DO RETANGULO: " + AreaTotal);
    }
}
