package Desafios.Interface;

// Essa classe Estende da Classe que contém as informações e implementa os metodos da interface Ninja
public class NinjaBasico extends Infos implements Ninja{

    // Metodo para receber os dados do ninja básico
    public NinjaBasico(String nome, int idade, String habilidade) {
        this.Nome = nome;
        this.Idade = idade;
        this.Habilidade = habilidade;
    }

    // Usa a interface Ninja para mostrar as informações
    public void MostrarInfos() {

        System.out.println("Meu nome é " + Nome);
        System.out.println("Tenho " + Idade + " Anos");
        System.out.println("Minha habilidade Especial é " + Habilidade);

    }

    // Usa a interface Ninja para executar a habilidade especial
    public void ExecutarHabilidade() {
        System.out.println("Executando a Minha Habilidade " + Habilidade);
    }

}
