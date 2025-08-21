public class SavingsAccount {
    public int balance;
    public double interestRate;
    public String customerName;
    //Konstruktor ini menginisialisasi SavingsAccount dengan saldo, suku bunga, dan nama pelanggan
    public SavingsAccount(int balance, double interestRate, String customerName) {
        balance = balance;
        interestRate = interestRate;
        customerName = customerName;
    }
    //Konstruktor ini menginisialisasi SavingsAccount dengan saldo awal
    public void deposit(int amount) {
        balance += amount;
    }
    //Metode ini menampilkan informasi pelanggan
    public void displayCustomer() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    //Metode ini menghitung bunga yang diperoleh berdasarkan saldo saat ini
    }
}
     
