package Construtores.classes;

public class ContaBancaria {
    private String titular;
    private double saldo;

    //construtor
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("depositado com sucesso.");
        System.out.println("saldo atual: R$" + this.saldo);
        System.out.println("----------------------------");
    }

    public void sacar(double valor){
        if (this.saldo < valor){
            System.out.println("saque indisponivel,saldo insuficiente.");
        } else {
            this.saldo -= valor;
            System.out.println("sacado com sucesso.");
            System.out.println("saldo atual: R$" + this.saldo);
            System.out.println("---------------------------");
        }
    }

    public void mostrarDados() {
        System.out.println("Nome do titular: " + this.titular);
        System.out.println("saldo atual: R$" + this.saldo);
        System.out.println("----------------------------");

    }
}
