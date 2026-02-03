package Associacao.classes;

import java.util.Arrays;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println("Nome do time: " + this.nome);
        if (jogadores != null) {
            System.out.println("---JOGADORES---");
            for (Jogador jogador : jogadores) {
                System.out.println("nome: " + jogador.getNome() + " - " + jogador.getPosicao());
            }

        } else {
            System.out.println("jogadores não encontrado");
        }
    }

    public String getNome() {
        return nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }
}
