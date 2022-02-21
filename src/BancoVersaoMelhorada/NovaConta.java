package BancoVersaoMelhorada;

public class NovaConta {

    private String clientName;
    private int accountNumber;
    private double accountBalance;

    public NovaConta( String clientName, int accountNumber) {
        this.accountNumber = accountNumber;
        this.clientName = clientName;
    }

    public NovaConta(String clientName, int accountNumber,  double initialDeposit) {
        this.accountNumber = accountNumber;
        this.clientName = clientName;
        depositValue(initialDeposit);
    }

    public String getClientName() {
        return clientName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void withdrawValue(double amount) {
        this.accountBalance -= (amount + 5.00);

    }

    public void depositValue(double amount) {
        this.accountBalance += amount;
    }

    public String toString() {
        return "\nUpdated account data:\n" +
                "Account: " + getAccountNumber() + ", Holder: " +
                getClientName() + String.format(", Balance: $ %.2f", getAccountBalance()) + "\n";
    }
}
