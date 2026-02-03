package Construtores.test;

import Construtores.classes.ContaBancaria;

public class contaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Joice Martins", 4600);
        conta1.depositar(253.99);
        conta1.sacar(590.50);
        conta1.mostrarDados();
        ContaBancaria conta2 = new ContaBancaria("Thiago Henrique ", 2100);
        conta2.sacar(2400);
        conta2.mostrarDados();


    }
}
