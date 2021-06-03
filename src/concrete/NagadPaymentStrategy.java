package concrete;

import strategy.PaymentStrategy;

public class NagadPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Pay with Nagad is successful");
    }
}
