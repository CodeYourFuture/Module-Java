class PaymentMethod {
    void pay(double amount) {
        System.out.println("Paying " + amount);
    }
    void pay(double amount, String currency){
        System.out.println("Paying " + amount + " " + currency);
    }
}
class DirectDebit extends PaymentMethod{
    @Override
    void pay(double amount) {
        System.out.println("Payment "+ amount + " using Direct Debit");
    }
}
public class Payment{
    public static void main(String[] args){
        PaymentMethod payment = new PaymentMethod();
        payment.pay(200);
        payment.pay(200,"£");
        DirectDebit directDebit = new DirectDebit();
        directDebit.pay(50);
    }
}