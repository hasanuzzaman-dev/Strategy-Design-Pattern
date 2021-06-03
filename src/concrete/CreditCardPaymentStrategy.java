package concrete;

import strategy.PaymentStrategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Pay with Credit Card is successful");
    }
}
