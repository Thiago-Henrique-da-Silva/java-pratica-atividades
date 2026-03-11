package Heranca.dominio.ContaBancaria;

public abstract class Conta {
    private String titular;
    private double saldo;
    private String numeroConta;

    public Conta(String titular, double saldo, String numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido para depositar.");
            return;
        }
        saldo += valor;
        System.out.println("deposito efetuado com sucesso.");
        System.out.println("Saldo atual: " + saldo);
    }

    public void sacar(double valor) {
        if (valor >  saldo) {
            System.out.println("saldo insuficiente para sacar.");
            return;
        }
        saldo -= valor;
        System.out.println("saque realizado com sucesso.");
        System.out.println("Saldo atual: " + saldo);
    }

    @Override
    public String toString() {
        return "titular: " + titular + "\nsaldo: " + saldo + "\nnumeroConta: " + numeroConta;
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


    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
