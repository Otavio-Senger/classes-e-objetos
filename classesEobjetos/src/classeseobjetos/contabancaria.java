
package classeseobjetos;
public class contabancaria {
    String titular;
    double saldo;
    int numeroconta;
    double sacar;
    double depositar;
    double saldofinal;

    public contabancaria(String titular, double saldo, int numeroconta, double sacar, double depositar) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroconta = numeroconta;
        this.sacar = sacar;
        this.depositar = depositar;
        this.saldofinal = saldo + depositar - sacar;
        
        
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getSaldofinal() {
        return saldofinal;
    }

    public void setSaldofinal(double saldofinal) {
        this.saldofinal = saldofinal;
    }
    

   
    
    
    
    
}
