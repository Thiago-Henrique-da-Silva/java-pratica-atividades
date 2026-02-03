package Encapsulamento.test;

import Encapsulamento.classes.Funcionario;

public class funcionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.setNome("Thiago henrique");
        funcionario01.setSalario(3.700);
        funcionario01.aumentarSalario(13);
        funcionario01.imprimir();
    }
}
