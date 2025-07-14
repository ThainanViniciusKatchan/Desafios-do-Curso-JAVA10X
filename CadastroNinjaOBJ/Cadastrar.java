package Desafios.CadastroNinjaOBJ;

public class Cadastrar {
        String Nome;
        int idade;
    public String ninja() {

        String[] AldeiaDaFolha = new String[4];

        AldeiaDaFolha[0] = "Naruto Uzumaki";
        AldeiaDaFolha[1] = "Sasuke Uchiha";
        AldeiaDaFolha[2] = "Sakura Haruno";
        AldeiaDaFolha[3] = "Kakashi Hatake";

        for (String Ninja : AldeiaDaFolha){
            if (Nome == Ninja) {
                return "Esse ninja pertence a aldeia da folha";
            }
        }
        return "Esse Ninja não pertence a aldeia da folha";
}

    public String Nivel() {
        if (idade > 20){
            return "Esse ninja é de nível 10";
        } else if (idade < 20 & idade >= 10){
            return "Esse ninja é de nível 5";
        }
        return "Esse ninja não tem nível";
    }

    public void ENinja(){
        System.out.println("è um ninja");
    }
}
