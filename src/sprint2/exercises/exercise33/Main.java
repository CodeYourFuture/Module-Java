package sprint2.exercises.exercise33;

class PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paying " + amount);
    }
    public void pay(double amount, String currency) {
        System.out.println("Paying " + amount + " " + currency);
    }
}
//is-a relation
class DirectDebit extends PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Direct Debit");
    }
}

class Checkout {
    //has-a relation
    private PaymentMethod paymentMethod;
    public Checkout(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void processPayment(double amount) {
        paymentMethod.pay(amount);
    }
    public void updatePaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
public class Main {
    public static void main(String[] args) {
        PaymentMethod paymentMethod = new PaymentMethod();
        Checkout checkout = new Checkout(paymentMethod);
        checkout.processPayment(200);
        PaymentMethod directDebit = new DirectDebit();
        checkout.updatePaymentMethod(directDebit);
        checkout.processPayment(500);
    }
}