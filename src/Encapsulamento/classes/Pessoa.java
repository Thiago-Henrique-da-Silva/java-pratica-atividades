package Encapsulamento.classes;

public class Pessoa {
    //encapsulamento
    private String nome;
    private int idade;

    // encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("idade invalida.");
            return;
        }
        this.idade = idade;
    }
}
