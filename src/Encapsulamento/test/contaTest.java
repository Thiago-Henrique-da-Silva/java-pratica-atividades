package Encapsulamento.test;


import Encapsulamento.classes.Conta;

public class contaTest {
    public static void main(String[] args) {
        //conta com deposito e saque com sucesso.
        Conta conta01 = new Conta();
        conta01.setSaldo(7.849);
        conta01.depositar(1.290);
        conta01.sacar(0.960);

        //conta com deposito e saque com falha.
        Conta conta02 = new Conta();
        conta02.setSaldo(8.849);
        conta02.depositar(-0.230);
        conta02.sacar(9.233);



    }
}
