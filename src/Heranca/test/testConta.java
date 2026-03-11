package Heranca.test;

import Heranca.dominio.ContaBancaria.contaCorrente;
import Heranca.dominio.ContaBancaria.ContaPoupanca;

public class testConta {
    public static void main(String[] args) {
        //CONTA CORRENTE
        contaCorrente contacorrente = new contaCorrente("Thiago", 11000, "64956-6");
        contacorrente.depositar(500);
        contacorrente.sacar(250);
        System.out.println(contacorrente);

        //CONTA POUPANÇA
        ContaPoupanca contapoupanca = new ContaPoupanca("Marcos", 7200, "72934-4", 900);
        contapoupanca.depositar(450);
        contapoupanca.sacar(250);
        //testando limite da conta
        contapoupanca.sacar(7000);
        System.out.println(contapoupanca);

    }
}
