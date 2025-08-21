public class AccountTest {
    //Data pengguna bank
    public static void main(String[] args) {
        //Membuat instance SavingsAccount dengan saldo awal, suku bunga, dan nama pelanggan
        SavingsAccount sa0001 = new SavingsAccount(0,0.04,"upin");
        sa0001.deposit (10000);
        sa0001.interestRate = 0.04;
        sa0001.customerName = "upin";
        //Data pengguna bank
        SavingsAccount sa0002 = new SavingsAccount(0,0.06,"ipin");
        sa0002.deposit (20000);
        sa0002.interestRate = 0.06;
        sa0002.customerName = "ipin";
        //Menampilkan informasi pelanggan
        System.out.println("Data Pengguna Bank: ");
        sa0001.displayCustomer();
        sa0002.displayCustomer();
        //Menghitung bunga yang diperoleh
        double interestEarned1 = sa0001.balance * sa0001.interestRate;
        double interestEarned2 = sa0002.balance * sa0002.interestRate;
        System.out.println("Interest earned by " + sa0001.customerName + " : " + interestEarned1);
        System.out.println("Interest earned by " + sa0002.customerName + " : " + interestEarned2);
        //Menghitung dan menampilkan hasil bagi dua angka
    }

        
    
        public double calculate(int x, double y){
             double quotient =x/y;
            return quotient;
        }

        }
         
    
        




