package methods;

import strategy.PaymentStrategy;

public class PaymentMethods {
    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executeStrategy(){
        paymentStrategy.pay();
    }
}
