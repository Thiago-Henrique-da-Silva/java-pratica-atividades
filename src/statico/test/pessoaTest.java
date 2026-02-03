package statico.test;

import statico.classes.Pessoa;

public class pessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa("Thiago Henrique", 21);
        Pessoa pessoa02 = new Pessoa("Joice martins", 22);
        Pessoa pessoa03 = new Pessoa("Cassiana Diva", 43);

        Pessoa[] pessoas = new Pessoa[] {pessoa01, pessoa02, pessoa03};

        for (Pessoa pessoa : pessoas) {
            pessoa.imprime();
        }

        System.out.println("total objetos: " + Pessoa.getTotalObjetos());
    }
}
