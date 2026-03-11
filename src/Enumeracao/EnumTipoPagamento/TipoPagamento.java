package Enumeracao.EnumTipoPagamento;

public enum TipoPagamento {
    PIX(0,0.05,"27349-01"),
    DEBITO(0.02,0,"82035-2"),
    CREDITO(0.04,0,"83056-3"),
    BOLETO(0,0,"83056-4");

    private double taxa;
    private double desconto;
    private String codigo;

    TipoPagamento(double taxa, double desconto, String codigo) {
        this.taxa = taxa;
        this.desconto = desconto;
        this.codigo = codigo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
