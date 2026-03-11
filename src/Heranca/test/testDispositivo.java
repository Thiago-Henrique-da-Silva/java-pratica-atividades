package Heranca.test;

import Heranca.dominio.Dispositivos.Celular;
import Heranca.dominio.Dispositivos.Notebook;

public class testDispositivo {
    public static void main(String[] args) {
        Celular celular = new Celular("Motorola", "Moto Edge 20 Pro", "31 972147028");
        //TESTES CELULAR
        celular.ligar();
        celular.fazerLigacao("31 997793252");
        celular.desligar();
        //testando possiveis erros
        celular.fazerLigacao("31 997793252");
        celular.desligar();

        Notebook notebook = new Notebook("Lenovo", "ideapad i7",8);
        //TESTES NOTEBOOK
        notebook.ligar();
        notebook.compilarCodigo();
        notebook.desligar();
        //testando possiveis erros
        notebook.desligar();
        notebook.compilarCodigo();
    }
}
