package Enumeracao.EnumNivelCliente;

public class Cliente {
    private String nome;
    private double valorCompra;
    private NivelCliente nivelcliente;

    public Cliente(String nome, double valorCompra, NivelCliente nivelcliente) {
        this.nome = nome;
        this.valorCompra = valorCompra;
        this.nivelcliente = nivelcliente;
    }

    public double valorFinal() {
        return valorCompra - (valorCompra * nivelcliente.getDesconto());
    }

    @Override
    public String toString() {
        return "nome do cliente: " + nome +
               "\nvalorCompra: " + valorCompra +
               "\nnivelcliente: " + nivelcliente +
               "\ndessconto aplicado: " + valorFinal() +
               "\n----------------";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public NivelCliente getNivelcliente() {
        return nivelcliente;
    }

    public void setNivelcliente(NivelCliente nivelcliente) {
        this.nivelcliente = nivelcliente;
    }
}
