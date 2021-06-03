public class PaymentMethods {

    private String selectedPaymentMethod;
    public void setSelectedPaymentMethod(String s){
        this.selectedPaymentMethod = s;
    }

    public void pay(){
        switch (selectedPaymentMethod){
            case  "COD" -> payWithCOD();
            case "Bkash" -> payWithBkash();
        }
    }

    private void payWithBkash() {
        System.out.println();
        System.out.println("Pay With COD is Successful!");
    }

    private void payWithCOD() {
        System.out.println("Pay with Bkash is successful");
    }
}
