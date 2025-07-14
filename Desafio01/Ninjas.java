package Desafios.Curso.Desafio01;

public class Ninjas{
    String nome;
    String Vila;
    String Missao;
    String NivelDificuldade;
    String Habilidade = "Esse ninja não é um Uchiha";

    int idade;

    int quantidade;

    String[][] Cadastros;
    int[] Idade;

    public void Cadastros(){
        Cadastros = new  String[quantidade][5];
        Idade = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {

            Cadastros[i][0] = nome;
            System.out.println(Cadastros[i][0]);
            Idade[i] = idade;
            System.out.println(Idade[i]);
            Cadastros[i][1] = Vila;
            System.out.println(Cadastros[i][1]);
            Cadastros[i][2] = Missao;
            System.out.println(Cadastros[i][2]);
            Cadastros[i][3] = NivelDificuldade;
            System.out.println( Cadastros[i][3]);
            Cadastros[i][4] = Habilidade;
            System.out.println(Cadastros[i][4]);

            System.out.println("Ninja cadastrado com sucesso!");

        }

    }

    public void ListarNinjas(){
       int IndexLinha = 0;
        for (int i = 0; i < 6; i++){
            System.out.println("Coluna" + i);
            System.out.println("Linhas" + IndexLinha);

            System.out.println(Cadastros[IndexLinha][i]);
            if (quantidade > 1 & i == 5){
                IndexLinha++;
            }


        }
    }

}
