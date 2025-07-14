package Desafios.Heranca;

public class Time {
    String nomeTime;
    String nomeJogador;
    String[] Jogadores = new String[5];

    public void CriarJogador() {
        for (int i = 0; i < Jogadores.length; i++){
            Jogadores[i] = nomeJogador;
        }
    }
}
