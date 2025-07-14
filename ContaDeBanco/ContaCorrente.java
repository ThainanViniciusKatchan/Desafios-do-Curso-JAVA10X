package Desafios.ContaDeBanco;

public class ContaCorrente extends ContaBancaria{

    double ValorConta;

    // Subscrita da interface Consultar Saldo
    @Override
    public void ConsultaSaldo() {
        System.out.println("_________________________________________________________________");
        System.out.println("O saldo da Sua Conta - " + this.Conta + " - é de R$" + this.ValorConta);
        System.out.println("__________________________________________________________________");
    }

    // Metodo para Depositar Valor na conta
    public double DepositoSaldo(double ValorDeposito) {
        System.out.println("_____________________________________________");
        System.out.println("Deposito em Conta " + Conta +  " Sendo Realizado");
        this.ValorConta = ValorDeposito;
        System.out.println("Você Depositou - R$" + this.ValorConta +  " - na conta " + Conta);
        System.out.println("_____________________________________________");
        return this.ValorConta;
    }

    // Metodo para Receber Transferências
    public double ReceberTransferencia(double ValorPasse) {

        this.ValorConta = this.ValorConta + ValorPasse;

        return this.ValorConta;

    };

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

    public ContaCorrente() {};

    public ContaCorrente(double Deposito, tipoConta Conta) {
        super(Deposito, Conta);

        this.ValorConta = Deposito;

        DepositoSaldo(Deposito);

    }

}
