package Associacao.test;

import Associacao.classes.Jogador;
import Associacao.classes.Time;

public class timeTest {
    public static void main(String[] args) {
        //criando jogadores e posições.
        Jogador jogador01 = new Jogador("Thiago Henrique", "goleiro");
        Jogador jogador02 = new Jogador("Julio Cesar", "atacante");
        Jogador jogador03 = new Jogador("Mario Tulio", "zaqueiro");
        Jogador jogador04 = new Jogador("Guilherme Rodrigues", "meio");
        //adicionando jogador aos jogadores.
        Jogador[] jogadores = new Jogador[] {jogador01, jogador02, jogador03,  jogador04};

        //criando time e adicionando jogadores ao time.
        Time time = new Time("Seleção Brasileira", jogadores);
        time.imprime();



    }
}
