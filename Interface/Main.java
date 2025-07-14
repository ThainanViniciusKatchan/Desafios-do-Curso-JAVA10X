package Desafios.Interface;

public class Main {

    public static void main(String[] args) {

        NinjaBasico Thainan = new NinjaBasico("Thainan", 25, "Muita bala no CS");
        Thainan.MostrarInfos();
        Thainan.ExecutarHabilidade();

        System.out.println(" ");

        NinjaAvancado Breno = new NinjaAvancado("Breno", 24, "Pouca Pika",
                "Mestre em zerar video jogos");

        Breno.MostrarInfos();
        Breno.ExecutarHabilidade();

    }
}
