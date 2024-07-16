package builderDesignPattern;

public class CreditCardPayment implements IPayment{
    @Override
    public String pay(double amount) {
        return "Payment is Done By Credit Card";
    }
}
