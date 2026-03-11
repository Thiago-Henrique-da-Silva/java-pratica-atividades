package Heranca.dominio.Funcionarios;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        if (salarioBase < 0) {
            throw new IllegalArgumentException("Salario invalido.");
        }
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    //criando metodo abstract para que as classes filhas herdarem obrigatoriamente.
    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "funcionario: " + nome + "\nsalarioBase: " + salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            throw new IllegalArgumentException("Salario invalido.");
        }
        this.salarioBase = salarioBase;
    }
}
