package Desafios.ContaDeBanco;

public abstract class ContaBancaria implements ControleDaConta{

    double ValorDeposito;
    double ValorTransferencia;
    tipoConta Conta;

    public ContaBancaria(){};

    public ContaBancaria(double Deposito){
        this.ValorDeposito = Deposito;
    }

    public ContaBancaria(double Deposito, double Transferencia){
        this.ValorDeposito = Deposito;
        this.ValorTransferencia = Transferencia;
    }

    public ContaBancaria(double Deposito, double Transferencia, tipoConta TipoDeConta) {
        this.ValorDeposito = Deposito;
        this.ValorTransferencia = Transferencia;
        this.Conta = TipoDeConta;
    }

    public ContaBancaria(double Deposito, tipoConta TipoDeConta) {
        this.ValorDeposito = Deposito;
        this.Conta = TipoDeConta;
    }

}
