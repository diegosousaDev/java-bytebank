package bitebank3;

public class ContaCorrente extends Conta implements Tributavel{

    private static double taxa = 0.1;

    public ContaCorrente(String agencia, String numero){
        super(agencia, numero);
    }

    public static void setTaxa(double taxa){
        ContaCorrente.taxa = taxa;
    }

    public static double getTaxa(){
        return taxa;
    }

    public void efetuarDeposito(double valor){
        super.saldo += valor;
    }

    public boolean efetuaSaque(double valor){
        double valorASacar = valor + 0.2;
        return super.efetuaSaque(valorASacar);
    }

    @Override
    public double getValorImposto(){
        return super.saldo * 0.01;
    }
}

