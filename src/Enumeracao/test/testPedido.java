package Enumeracao.test;

import Enumeracao.EnumPedido.Pedido;
import Enumeracao.EnumPedido.StatusPedido;

public class testPedido {
    public static void main(String[] args) {
        //criando pedido com o status pendente
        Pedido pedido1 = new Pedido("Thiagpo H", 50, StatusPedido.PENDENTE);
        System.out.println(pedido1);
        //criando pedido com o status ja em processamento(apenas para simulação)
        Pedido pedido2 = new Pedido("Joice M", 25, StatusPedido.PROCESSANDO);
        System.out.println(pedido2);
    }
}
