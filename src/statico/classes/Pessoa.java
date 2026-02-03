package statico.classes;

public class Pessoa {
    private static int totalObjetos;
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        totalObjetos++;
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("-----------------");

    }

    public static int getTotalObjetos() {
        return totalObjetos;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
