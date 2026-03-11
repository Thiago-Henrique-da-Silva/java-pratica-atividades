package Enumeracao.EnumTipoPagamento;

public class Compra {
    private String produto;
    private double valor;
    private TipoPagamento tipopagamento;

    public Compra(String produto, double valor, TipoPagamento tipopagamento) {
        this.produto = produto;
        this.valor = valor;
        this.tipopagamento = tipopagamento;
    }

    public  double valorFinal() {
        if (tipopagamento == TipoPagamento.PIX) {
            return valor - (valor * tipopagamento.getDesconto());
        } else if (tipopagamento == TipoPagamento.DEBITO) {
            return valor + (valor * tipopagamento.getTaxa());
        } else if (tipopagamento == TipoPagamento.CREDITO) {
            return valor + (valor * tipopagamento.getTaxa());
        } else {
            return valor;
        }
    }

    /* OU
    public double valorFinal() {
        return valor + (valor * tipopagamento.getTaxa())
                - (valor * tipopagamento.getDesconto());
    }
    */

    @Override
    public String toString() {
        return "produto: " + produto +
               "\nvalor: " + valor +
               "\ntipo de pagamento: " + tipopagamento +
               "\ndesconto : " + tipopagamento.getDesconto() +
               "\ntaxa : " + tipopagamento.getTaxa() +
               "\ntotal: " + valorFinal();
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoPagamento getTipopagamento() {
        return tipopagamento;
    }

    public void setTipopagamento(TipoPagamento tipopagamento) {
        this.tipopagamento = tipopagamento;
    }
}
