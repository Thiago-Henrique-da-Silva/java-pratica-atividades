package Associacao.test;

import Associacao.classes.Pedido;
import Associacao.classes.Produto;

public class pedidoTest {
    public static void main(String[] args) {
        Produto produto01 = new Produto("leite", 2.99);
        Produto produto02 = new Produto("arroz", 11.99);
        Produto produto03 = new Produto("doritus", 12.00);
        Produto produto04 = new Produto("feijão", 9.99);
        Produto[] produtos = {produto01, produto02, produto03, produto04};

        Pedido pedido = new Pedido("Thago Herique", produtos);
        pedido.imprimir();
    }
}
