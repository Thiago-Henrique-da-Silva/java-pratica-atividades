package Enumeracao.EnumNivelCliente;

public enum NivelCliente {
    //aplicando desconto para cada tipo de cliente
    COMUM(0.05),
    VIP(0.10),
    PREMIUM(0.20);

    private double desconto;

    NivelCliente(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
