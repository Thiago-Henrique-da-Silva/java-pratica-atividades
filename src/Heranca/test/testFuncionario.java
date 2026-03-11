package Heranca.test;

import Heranca.dominio.Funcionarios.Desenvolvedor;
import Heranca.dominio.Funcionarios.Gerente;

public class testFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Thiago h",3400);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Thiago h",3400);
        System.out.println(desenvolvedor);
    }
}
