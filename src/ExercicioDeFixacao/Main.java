package ExercicioDeFixacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the dollar price? " );
        double dollarPrice = scan.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amountOfMoney = scan.nextDouble();

        double result = CurrencyConverter.dollarConverter(dollarPrice, amountOfMoney);

        System.out.printf("Amount to be paid in reais = R$ %.2f", result);
        scan.close();
    }
}
