//exercicio 6: classe contador
package exerciciosclasseseobjetos;

import java.util.Scanner;

/**
 *
 * @author Kassio Dias Monteiro
 */
public class Ex6Contador {

    private int numero;

    public Ex6Contador(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void Contar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE UM NUMERO: ");
        int resp = sc.nextInt();

        int total = numero + resp;
        System.out.println("VALOR INICIAL: " + numero + "  VALOR ADICIONADO: " + resp + "  TOTAL:" + total);
    }

}
