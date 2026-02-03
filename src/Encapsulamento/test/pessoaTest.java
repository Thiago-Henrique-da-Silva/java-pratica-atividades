package Encapsulamento.test;

import Encapsulamento.classes.Pessoa;

public class pessoaTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Thiago Henrique");
        p1.setIdade(21);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("-----------------");

        Pessoa p2 = new Pessoa();
        p2.setNome("Joice Martins");
        p2.setIdade(-1);
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Idade: " + p2.getIdade());



    }
}
