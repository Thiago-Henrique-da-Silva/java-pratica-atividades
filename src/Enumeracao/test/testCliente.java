package Enumeracao.test;

import Enumeracao.EnumNivelCliente.Cliente;
import Enumeracao.EnumNivelCliente.NivelCliente;

public class testCliente {
    public static void main(String[] args) {
        //desconto de 5% para clientes comuns
        Cliente cliente1 = new Cliente("Thiago", 240, NivelCliente.COMUM);
        System.out.println(cliente1);

        //desconto 10% para clientes VIP
        Cliente cliente2 = new Cliente("Joice", 240, NivelCliente.VIP);
        System.out.println(cliente2);

        //desconto 20% para clientes premium
        Cliente cliente3 = new Cliente("Marcos", 240, NivelCliente.PREMIUM);
        System.out.println(cliente3);
    }
}
