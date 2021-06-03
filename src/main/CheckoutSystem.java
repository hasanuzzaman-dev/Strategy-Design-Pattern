package main;

import concrete.BkashPaymentStrategy;
import concrete.CODPaymentStrategy;
import concrete.CreditCardPaymentStrategy;
import concrete.NagadPaymentStrategy;
import methods.PaymentMethods;

public class CheckoutSystem {
    public static void main(String[] args) {
        PaymentMethods paymentMethods = new PaymentMethods();
        int orderAmount = 500;

        String selectedMethod = "COD";

        if (selectedMethod.equals("Bkash")){
            paymentMethods.setPaymentStrategy(new BkashPaymentStrategy());
            paymentMethods.executeStrategy();
        }else if (selectedMethod.equals("Nagad")) {
            paymentMethods.setPaymentStrategy(new NagadPaymentStrategy());
            paymentMethods.executeStrategy();
        } else if (selectedMethod.equals("Card")) {
            paymentMethods.setPaymentStrategy(new CreditCardPaymentStrategy());
            paymentMethods.executeStrategy();
        } else if (orderAmount >= 500 && selectedMethod.equals("COD")) {
            paymentMethods.setPaymentStrategy(new CODPaymentStrategy());
            paymentMethods.executeStrategy();
        } else {
            System.out.println("Sorry! Minimum 500tk order is required for COD");
        }
    }
}
