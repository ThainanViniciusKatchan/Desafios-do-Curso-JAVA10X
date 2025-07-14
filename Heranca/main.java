package Desafios.Heranca;

import java.util.Scanner;

public class main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Furia Time = new Furia();
        Time.nomeTime = "Furia";
        for (int i = 0; i < 5; i++){
            System.out.println("Nome do jogador " + i + " do time " + Time.nomeTime + ": ");
            String Jogador = input.next();
            Time.Jogadores[i] = Jogador;

        }

        Time.Furiosa();

        Imperial Imp = new Imperial();

        Imp.nomeTime = "Imperial";

        for (int i = 0; i < 5; i++){
            System.out.println("Nome do jogador " + i + " do time " + Imp.nomeTime + ": ");
            String JogadorImp = input.next();
            Imp.Jogadores[i] = JogadorImp;
        }

        Imp.MajorPranois();

        input.close();
    }

}
