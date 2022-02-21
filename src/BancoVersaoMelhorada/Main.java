package BancoVersaoMelhorada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        NovaConta cliente;
        int account;
        String name;
        char choice;

        System.out.print("Enter account number: ");
        account = scan.nextInt();

        System.out.print("Enter account holder: ");
        scan.nextLine();
        name = scan.nextLine();

        System.out.print("Is there an initial deposit? (y / n) ");
        choice = scan.next().charAt(0);

        if (choice == 'y') {
            System.out.print("Enter initial deposit: ");
            double valor = scan.nextDouble();
            cliente = new NovaConta(name, account, valor);
            System.out.println(cliente);;
        } else {
            cliente = new NovaConta(name, account);
            System.out.println(cliente);;
        }

        System.out.print("Enter a deposit value: ");
        cliente.depositValue(scan.nextDouble());
        System.out.println(cliente);

        System.out.print("Enter a withdraw value: ");
        cliente.withdrawValue(scan.nextDouble());
        System.out.println(cliente);

        scan.close();
    }
}
