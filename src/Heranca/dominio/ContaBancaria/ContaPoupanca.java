package Heranca.dominio.ContaBancaria;

public class ContaPoupanca extends Conta {
    //aplicando limite minimo da conta
    private double limiteMinimo;

    public ContaPoupanca(String titular, double saldo, String numeroConta, double limiteMinimo) {
        super(titular, saldo, numeroConta);
        this.limiteMinimo = limiteMinimo;
    }

    @Override
    public void sacar(double valor) {
        //verificando limite da conta
        if (getSaldo() - valor < limiteMinimo) {
            System.out.println("Saque não permitido: limite mínimo da conta atingido.");
            return;
        }
        super.sacar(valor);
    }

    @Override
    public String toString() {
        return "ContaPoupanca { titular: " + getTitular() +
                ", saldo: " + getSaldo() +
                ", numeroConta: " + getNumeroConta() +
                ", limiteMinimo: " + limiteMinimo + " }";
    }

    public double getLimiteMinimo() {
        return limiteMinimo;
    }

    public void setLimiteMinimo(double limiteMinimo) {
        this.limiteMinimo = limiteMinimo;
    }
}
