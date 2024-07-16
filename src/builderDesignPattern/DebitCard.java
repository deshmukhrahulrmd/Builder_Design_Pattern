package builderDesignPattern;

public class DebitCard implements IPayment{
    @Override
    public String pay(double amount) {
        return "payment is Done By Debit Card";
    }
}
