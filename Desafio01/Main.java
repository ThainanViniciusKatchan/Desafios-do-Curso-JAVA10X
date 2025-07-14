package Desafios.Curso.Desafio01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        Painel Opcaoes = new Painel();

        int Escolha = 0;

        while (Escolha != 4) {

            Opcaoes.Menu();
            Escolha = Input.nextInt();
            switch (Escolha) {
                case 1:
                    Ninjas Outros = new Ninjas();

                    System.out.print("Qual a quantidade de ninjas: ");
                    Outros.quantidade = Input.nextInt();

                    Outros.nome = Input.next();
                    Outros.idade = Input.nextInt();
                    Outros.Vila = Input.next();
                    Outros.Missao = Input.next();
                    Outros.NivelDificuldade = Input.next();
                    Outros.Habilidade = Input.next();

                    Outros.Cadastros();

                case 2:
                    if (Escolha == 2) {
                        Ninjas Infos = new Ninjas();
                        Infos.ListarNinjas();
                    }

            }

        }
        Input.close();
    }

}



