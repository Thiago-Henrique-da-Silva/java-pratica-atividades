package Construtores.classes;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    //construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void  valorTotalNoEstoque(){
        System.out.println("nome do produto: " + this.nome);
        System.out.println("quantidade do produto: " + this.quantidade + " caixas");
        System.out.println("preço do produto: R$" + this.preco);
        System.out.println("valor total no estoque: R$" + this.quantidade * this.preco);
        System.out.println("--------------------------");
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
