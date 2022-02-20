package ExercicioDeFixacao;

public class CurrencyConverter {

    public static double iofTax = 0.06;

    public static double dollarConverter(double dollarPrice, double amountOfMoney) {

        return amountOfMoney * dollarPrice * (1.0 + iofTax);
    }
}
