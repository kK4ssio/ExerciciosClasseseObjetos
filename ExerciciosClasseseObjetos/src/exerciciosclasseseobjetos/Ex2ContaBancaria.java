//exercicio 2: classe conta bancaria.
package exerciciosclasseseobjetos;

/**
 *
 * @author Kassio Dias Monteiro
 */
public class Ex2ContaBancaria {
//atributos    

    private String titular;
    private int saldo;
    private int numConta;
    private String AddSaldo;
//getters e setters    

    public Ex2ContaBancaria(String titular, int saldo, int numConta, String AddSaldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.numConta = numConta;
        this.AddSaldo = AddSaldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getAddSaldo() {
        return AddSaldo;
    }

    public void setAddSaldo(String addSaldo) {
        this.AddSaldo = AddSaldo;
    }

    public void mostarInfos() {
        System.out.println("Adicionar saldo ou não? sim(s) não(n)");
        if (AddSaldo == "s") {
            int AddSaldo = +50;
            int total = AddSaldo + saldo;
            System.out.println("TITULAR: " + titular + "  SALDO: " + total + "  NUMERO DA CONTA: " + numConta);
        }
        if (AddSaldo == "n") {
            System.out.println("TITULAR: " + titular + "  SALDO: " + saldo + "  NUMERO DA CONTA: " + numConta);
        }
    }
}
