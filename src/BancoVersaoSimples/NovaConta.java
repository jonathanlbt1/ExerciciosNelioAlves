package BancoVersaoSimples;

public class NovaConta {

    private int numeroDaConta;
    private String nomeDoTitular;
    private double saldoDaConta = 0.0;

    public NovaConta(int numeroDaConta, String nomeDoTitular, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldoDaConta = 0.0;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void depositoEmConta(double valor) {
        this.saldoDaConta += valor;
        statusDaConta();
    }

    public void saqueDaConta(double valor) {
        this.saldoDaConta -= (valor + 5.00);
        statusDaConta();
    }

    public void statusDaConta() {
        System.out.println("Titular: " + getNomeDoTitular() + "\n " + "Conta Corrente: " + getNumeroDaConta() + "\n " +
                String.format("Saldo em conta: R$ %.2f",  getSaldoDaConta()) + "\n");
    }
}
