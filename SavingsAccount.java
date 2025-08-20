public class SavingsAccount {
    public int balance;
    public double interestRate;
    public String customerName;
    //This constructor initializes the SavingsAccount with balance, interest rate, and customer name
    public SavingsAccount(int balance, double interestRate, String customerName) {
        balance = balance;
        interestRate = interestRate;
        customerName = customerName;
    }
    //This method allows the user to deposit money into the account
    public void deposit(int amount) {
        balance += amount;
    }
    //This method displays the customer's information
    public void displayCustomer() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    // This method calculates the interest earned based on the current balance
    }
}
     