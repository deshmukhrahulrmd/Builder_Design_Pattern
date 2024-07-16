package builderDesignPattern;

public class UpiPayment implements IPayment{
    @Override
    public String pay(double amount) {
        return "Payment is Done by UPI";
    }
}
