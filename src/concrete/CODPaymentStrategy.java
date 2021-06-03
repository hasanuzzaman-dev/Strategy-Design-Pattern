package concrete;

import strategy.PaymentStrategy;

public class CODPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Pay with COD is successful");
    }
}
