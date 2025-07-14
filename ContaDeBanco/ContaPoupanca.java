package Desafios.ContaDeBanco;

public class ContaPoupanca extends ContaBancaria{
    double ValorConta;
    double Rendimento;

    // Subscrita da interface Consultar Saldo
    @Override
    public void ConsultaSaldo(){
        System.out.println("Valor na Conta - " + Conta + " - R$" + ValorConta);
    };

    // Metodo para Calculo Do Rendimento da Conta Poupança
    public void rendimentopoupanca(){
        System.out.println("Valor Rendendo!");
        Rendimento = (double) 5 / 100;
        ValorConta += ValorConta * Rendimento;
        System.out.println("seu Saldo Agora é de R$" + this.ValorConta);
    }

    // Metodo para Depositar Valor na conta
    @Override
    public double DepositoSaldo(double ValorDeposito) {
        System.out.println("_____________________________________________");
        System.out.println("Deposito na Conta - "  + this.Conta + " - Sendo Realizado");
        this.ValorConta = ValorDeposito;
        System.out.println("Você Depositou - R$" + this.ValorConta + " - na sua conta " + Conta);
        System.out.println();
        System.out.println("Esse valor ira render para você 5% ao mês");
        System.out.println("_____________________________________________");
        return ValorConta;
    }

    // Metodo para Realizar Transferências
    public void RelizarTransferencia(ContaBancaria ContaDestino, double ValorTransfer) {

        if (ValorTransfer < this.ValorConta) {
            ValorConta = ValorConta - ValorTransfer;
            System.out.println("Realizando uma transferência da conta "+ Conta + " no valor de R$" + ValorTransfer + " Para a Conta " + tipoConta.Poupanca);
            ContaDestino.ReceberTransferencia(ValorTransfer);
            ConsultaSaldo();
        } else if (ValorTransfer > this.ValorConta) {
            System.out.println("Você Não Tem Dinheiro o Suficiente Para Realizar Essa Transferência");
        }
    };

    // Metodo para Receber Transferências
    public double ReceberTransferencia(double ValorPasse) {

        this.ValorConta = this.ValorConta + ValorPasse;

        return this.ValorConta;

    };

    public ContaPoupanca() {};

    public ContaPoupanca(double Deposito, tipoConta Conta){
        super(Deposito, Conta);

        ValorConta = Deposito;

        DepositoSaldo(Deposito);

    };

}
