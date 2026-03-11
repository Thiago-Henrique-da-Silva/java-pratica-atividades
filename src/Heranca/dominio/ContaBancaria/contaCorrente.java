package Heranca.dominio.ContaBancaria;

public class contaCorrente extends Conta{
    //taxa de 2% aplicada na hora do saque
    private static final double TAXA_SAQUE = 0.02;

    public contaCorrente(String titular, double saldo, String numeroConta) {
        super(titular, saldo, numeroConta);
    }

    @Override
    public void sacar(double valor) {
        //aplicando taxa de 2%
        super.sacar(valor + (valor * TAXA_SAQUE));
    }

    @Override
    public String toString() {
        return "contaCorrente{titular: " + getTitular() + "saldo: " + getSaldo() + ", numero da conta: " + getNumeroConta() + "}";
    }
}
