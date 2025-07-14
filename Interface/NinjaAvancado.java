package Desafios.Interface;

public class NinjaAvancado extends Infos implements Ninja{

    String Especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {

        this.Nome = nome;
        this.Idade = idade;
        this.Habilidade = habilidade;
        this.Especialidade = especialidade;

    }

    public void MostrarInfos() {

        System.out.println("Meu nome é " + Nome);
        System.out.println("Tenho " + Idade + " Anos");
        System.out.println("Minha habilidade Especial é " + Habilidade);

    }

    public void ExecutarHabilidade() {
        System.out.println("Executando a Minha Habilidade " + Habilidade);
        System.out.println("A Minha Especialidade é " + Especialidade);
    }



}
