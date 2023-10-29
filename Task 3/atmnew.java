import java.util.Scanner;
class BankAccount {
    private double Balance;

    public BankAccount(double initial_Balance) {
        Balance = initial_Balance;
    }

    public double getBalance() {
        return Balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            Balance += amount;
            System.out.println("Money Deposit:" + amount);
            System.out.println("Total amount" + Balance);

        } else {
            System.out.println("Invaild amount deposited");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= Balance) {
            Balance -= amount;
            System.out.println("Money Withdrawal:" + amount);
            System.out.println("Total amount" + Balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}
class ATM {
    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account) {
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    public void Showmenu() {
        System.out.println("**WELCOME TO ATM*");
        System.out.println("Atm Menu:");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit Cash");
        System.out.println("3.Withdraw Cash");
        System.out.println("4.Exit");
    }

    public void start() {
        int choice;
        do {
            Showmenu();
            System.out.println("Enter Your Choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Exiting Atm,Thankyou");
                    break;
                default:
                    System.out.println("Invaild choice ,please enter valid option");
            }
        } while (choice != 4);
    }

    private void checkBalance() {
        System.out.println("Current Balance:" + account.getBalance());
    }

   private void deposit() {
        System.out.println("Enter deposit amount:");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

   private void withdraw() {
        System.out.println("Enter withdrawal amount:");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }
}


public class atmnew {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000);
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
