package builderDesignPattern;

public class DriverClass {

    /* *
    *
    * //TODO
    * Injecting one class object into another by using setter method() is known as Setter Injection.
    *
    *  */
    public static void main(String[] args) {

        // Injecting object into BillCollector (by- Setter Injection)
        BillCollector bc1 = new BillCollector();
        bc1.setPayment(new AmexCard());
        bc1.CollectPayment(8000);

        //Injecting object into BillCollector (by- Setter Injection)
        BillCollector bc2 = new BillCollector(new CreditCardPayment());
        bc2.CollectPayment(3000);
    }
}
