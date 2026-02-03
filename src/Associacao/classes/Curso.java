package Associacao.classes;

public class Curso {
    private String nome;
    private double horas;
    private Professor professor;

    public Curso(String nome, double horas, Professor professor) {
        this.nome = nome;
        this.horas = horas;
        this.professor = professor;
    }

    public void imprime() {
        System.out.println("Nome do curso: " + this.nome);
        System.out.printf("Carga horaria: %.3f horas\n" , this.horas);
        if (professor == null) return;
        System.out.println("Professor: " + professor.getNome() + " / especialização: " + professor.getEspecialidade());
    }

    public String getNome() {
        return nome;
    }

    public double getHoras() {
        return horas;
    }

    public Professor getProfessor() {
        return professor;
    }
}
