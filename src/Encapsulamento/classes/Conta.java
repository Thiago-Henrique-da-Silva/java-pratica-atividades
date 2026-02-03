package Encapsulamento.classes;

public class Conta {
    //encapsulamento
    private double saldo;

    public void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente.");
            return;
        }
        this.saldo -= valor;
        System.out.println("saque realizado com sucesso.");
        System.out.printf("Saldo atual: %.3f\n", this.saldo);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("você deve inserir um valor positivo para depositar.");
            return;
        }
        this.saldo += valor;
        System.out.println("depositado com sucesso.");
        System.out.printf("Saldo atual: %.3f\n", this.saldo);
    }

    //encapsulamento
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
