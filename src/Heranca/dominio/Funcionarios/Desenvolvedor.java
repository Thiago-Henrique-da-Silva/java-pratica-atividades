package Heranca.dominio.Funcionarios;

public class Desenvolvedor extends Funcionario {
    //Comissão fixa aplicada para cada projeto concluído
    private static final double VALOR_POR_PROJETO = 500;

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase() * VALOR_POR_PROJETO);
    }

    @Override
    public String toString() {
        return "nome: " + getNome() + "\nsalario base: " + getSalarioBase() + "\nsalario total: " + calcularSalario();
    }

}
