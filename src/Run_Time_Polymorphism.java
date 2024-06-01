interface Payment{
    void pay(int amount);
}

class CreditCard implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using Credit Card");
    }
}

class PayPal implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using money transfer");
    }
}

class BankTransfer implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using Bank Transfer");
    }
}

public class Run_Time_Polymorphism {
    public static void main(String[] args) {
    Payment payment;
    payment = new CreditCard();
    payment.pay(100);

    payment = new PayPal();
    payment.pay(1000);
    
    payment = new BankTransfer();
    payment.pay(10000);
    }
}
