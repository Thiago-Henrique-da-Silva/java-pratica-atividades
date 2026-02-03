package Associacao.test;

import Associacao.classes.Curso;
import Associacao.classes.Professor;

public class cursoTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Antonio Carlos", "programador BackEnd");
        Curso curso = new Curso("Programação", 2.200, professor);
        curso.imprime();



    }
}
