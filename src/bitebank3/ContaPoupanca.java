package bitebank3;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String numero, String agencia){
        super(numero, agencia);
    }

    @Override
    public void efetuarDeposito(double valor){
        super.saldo += valor;
    }

}
