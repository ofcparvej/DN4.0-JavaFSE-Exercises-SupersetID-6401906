package AdapteeImpl;

import IPaymentProcessorAdaptee.PaymentProcessor;

public class Stripe implements PaymentProcessor {
    @Override
    public void processPayment(double x){
        System.out.println("Rs : " + x + " " + "Paid Using Stripe");
    }
}
