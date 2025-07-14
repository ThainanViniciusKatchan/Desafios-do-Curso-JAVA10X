package Desafios.ContaDeBanco;

public class Main{

    public static void main(String[] args) {

        ContaCorrente Corrente = new ContaCorrente(600, tipoConta.Corrente);
        Corrente.ConsultaSaldo();

        ContaPoupanca Poupanca = new ContaPoupanca(1200, tipoConta.Poupanca);

        Corrente.RelizarTransferencia(Poupanca,100);

        Poupanca.ConsultaSaldo();
        Poupanca.rendimentopoupanca();
        Poupanca.RelizarTransferencia(Corrente,800);

        Corrente.ConsultaSaldo();

    }

}
