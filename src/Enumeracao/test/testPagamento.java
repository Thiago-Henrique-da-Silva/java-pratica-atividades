package Enumeracao.test;

import Enumeracao.EnumTipoPagamento.Compra;
import Enumeracao.EnumTipoPagamento.TipoPagamento;

public class testPagamento {
    public static void main(String[] args) {
        //compra com desconto
        Compra compra1 = new Compra("celular",2100, TipoPagamento.PIX);
        System.out.println(compra1);

        //compra com taxa
        Compra compra2 = new Compra("TV",2500, TipoPagamento.DEBITO);
        System.out.println(compra2);

        //compra sem taxa e sem desconto
        Compra compra3 = new Compra("geladeira",4100, TipoPagamento.BOLETO);
        System.out.println(compra3);

    }
}
