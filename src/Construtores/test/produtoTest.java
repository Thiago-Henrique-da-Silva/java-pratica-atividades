package Construtores.test;

import Construtores.classes.Produto;

public class produtoTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Leite", 2.99, 12);
        produto1.valorTotalNoEstoque();
    }
}
