package main;

import methods.PaymentMethods;

public class CheckoutSystem {
    public static void main(String[] args) {
        PaymentMethods paymentMethods = new PaymentMethods();
        int orderAmount = 500;

        String selectedMethod = "COD";

        if (selectedMethod.equals("Bkash")){
            paymentMethods.setSelectedPaymentMethod("Bkash");
            paymentMethods.pay();
        }else if (orderAmount >= 1000 && selectedMethod.equals("COD")){
            paymentMethods.setSelectedPaymentMethod("COD");
            paymentMethods.pay();
        }else {
            System.out.println("Sorry!!Minimum 1000 tk. order is required for COD");
        }
    }
}
