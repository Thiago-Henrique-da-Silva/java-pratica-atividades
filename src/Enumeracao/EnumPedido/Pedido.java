package Enumeracao.EnumPedido;

public class Pedido {
    private String cliente;
    private double valor;
    private StatusPedido status;

    public Pedido(String cliente, double valor, StatusPedido status) {
        this.cliente = cliente;
        this.valor = valor;
        this.status = status;
    }

    @Override
    public String toString() {
        return "cliente:" + cliente + "\nvalor:" + valor + "\nstatus:" + status;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
}
