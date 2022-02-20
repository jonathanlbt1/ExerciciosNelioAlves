package BancoVersaoSimples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        NovaConta cliente = new NovaConta(12345, "Jonathan Moraes", 0.0);

        cliente.depositoEmConta(1500.00);

        cliente.saqueDaConta(229.00);

        cliente.setNomeDoTitular("Jonathan Morris");
        cliente.statusDaConta();

        scan.close();
    }
}
