package Encapsulamento.classes;

public class Funcionario {
    //encapsulamento
    private String nome;
    private double salario;

    public void aumentarSalario(double percentual) {
        System.out.println("porcentagem do aumento: " + percentual + "%");
        this.salario = this.salario * (1 + percentual / 100);
    }

    public void imprimir() {
        System.out.println("Nome do funcionario: " + this.nome);
        System.out.println("Salario do Funcionario: " + this.salario);
    }

    //encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
