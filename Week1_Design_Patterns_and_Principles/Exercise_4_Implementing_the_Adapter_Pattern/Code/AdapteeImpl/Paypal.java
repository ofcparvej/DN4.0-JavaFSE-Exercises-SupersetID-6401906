package AdapteeImpl;

import IPaymentProcessorAdaptee.PaymentProcessor;

public class Paypal implements PaymentProcessor {
    @Override
    public void processPayment(double x){
        System.out.println("Rs : " + x + " " + "Paid Using PayPal");
    }
}
