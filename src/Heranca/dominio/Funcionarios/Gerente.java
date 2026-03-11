package Heranca.dominio.Funcionarios;

public class Gerente extends Funcionario {
    //Comissão fixa aplicada para o gerente
    private static final double BONUS_FIXO = 1200;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + BONUS_FIXO;
    }

    @Override
    public String toString() {
        return "nome: " + getNome() + "\nsalario base: " + getSalarioBase() + "\nsalario total: " + calcularSalario();
    }

}
