package Associacao.classes;

public class Pedido {
    private String nome;
    private Produto[] produtos;
    private double totalPreco;

    public  Pedido(String nome, Produto[] produtos) {
        this.nome = nome;
        this.produtos = produtos;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        if (this.produtos == null) {
            System.out.println("Nenhum produto na sua lista.");
            return;
        }
        System.out.println("---PRODUTOS---");
        for (Produto produto : this.produtos) {
            System.out.println("Nome do produto: " + produto.getNome());
            System.out.println("Preco do produto: R$" + produto.getPreco());
            System.out.println("------------------------------");
            totalPreco += produto.getPreco();
        }
        System.out.println("Total dos produtos: R$" + totalPreco);

    }

    public double getTotalPreco() {
        return totalPreco;
    }

    public String getNome() {
        return nome;
    }

    public Produto[] getProdutos() {
        return produtos;
    }
}
