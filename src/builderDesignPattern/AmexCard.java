package builderDesignPattern;

public class AmexCard implements IPayment{
    @Override
    public String pay(double amount) {
        return "Payment is Done By Amex Card";
    }
}
