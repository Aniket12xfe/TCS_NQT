class BankAccount{
    public String AccountHolder;
    public double balance;

    BankAccount(){
        this.AccountHolder = "Unknown";
        this.balance = 0.0;
    }
    BankAccount(String accountHolder, double InitialBalance){
        this.AccountHolder = accountHolder;
        this.balance = InitialBalance;
    }
    BankAccount(String accountHolder){
        this.AccountHolder = accountHolder;
        this.balance = 0.0;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
        }
    }
}

public class Bank_Constructor {
    public static void main(String[] args) {
    BankAccount ba = new BankAccount();
    String Holder = ba.AccountHolder;
    System.out.println(Holder);
    double bal = ba.balance;
    System.out.println(bal);

    ba.deposit(500.0);
    ba.withdraw(200.0);
    System.out.println(bal);

    BankAccount BA = new BankAccount("Aniket", 500.0);
    String holder = BA.AccountHolder;
    System.out.println(holder);
    double balanceHolder = BA.balance;
    System.out.println(balanceHolder);

    BA.deposit(500.0);
    BA.withdraw(200.0);
    System.out.println(balanceHolder);
    }
}
