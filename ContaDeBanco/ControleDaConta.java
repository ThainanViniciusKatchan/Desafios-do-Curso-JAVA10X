package Desafios.ContaDeBanco;

public interface ControleDaConta {

    void ConsultaSaldo();

    double DepositoSaldo(double ValorDeposito);

    double ReceberTransferencia(double ValorPasse);

}
