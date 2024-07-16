package builderDesignPattern;

public class BillCollector {

    /*
    * //NOTE
    * Here BillCollector having interface ref. variable.
    * Interface having multiple implementations classes.
    * We have to decide any implementation class at runtime.
    *
    * */
    private IPayment payment;

    public void setPayment(IPayment payment){
        this.payment = payment;
    }

    public BillCollector(){

    }

    public BillCollector(IPayment payment){
        this.payment = payment;
    }

    public void CollectPayment(double amount){

//        CreditCardPayment creditCardPayment = new CreditCardPayment();
//        String status = creditCardPayment.pay(amount);
//        System.out.println(status);

        String status = payment.pay(amount);
        System.out.println(status);
    }
}
