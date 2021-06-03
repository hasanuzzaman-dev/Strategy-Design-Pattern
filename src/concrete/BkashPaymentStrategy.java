package concrete;

import strategy.PaymentStrategy;

public class BkashPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Pay with Bkash is successful");
    }
}
