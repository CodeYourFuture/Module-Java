//Tasks:
//Make balance private in BankAccount
//Add methods to BankAccount to allow for deposits, withdrawals and balance checks without direct field access
//Add validation to these methods:
//deposit amount must be > 0
//withdraw amount must be > 0
//balance must never go below 0
//Update BankService so it no longer accesses account.balance directly
//Update Main so it no longer reads/writes balance directly
class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than 0.");
            return;
        }
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}
class BankService {
    public void deposit(BankAccount account, double amount) {
        account.deposit(amount);
    }
    public void withdraw(BankAccount account, double amount) {
        account.withdraw(amount);
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        BankService service = new BankService();
        service.withdraw(account, 150);  // should fail (insufficient funds)
        service.deposit(account, 50);    // adds money
        System.out.println("Balance: " + account.getBalance());
    }
}