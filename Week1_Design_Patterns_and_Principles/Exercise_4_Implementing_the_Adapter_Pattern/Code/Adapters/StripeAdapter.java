package Adapters;

import AdapteeImpl.Paypal;
import AdapteeImpl.Stripe;
import IPaymentProcessorAdaptee.PaymentProcessor;

public class StripeAdapter implements PaymentProcessor {
    private Stripe s;

    public StripeAdapter(Stripe s){
        this.s = s;
    }

    @Override
    public void processPayment(double x){
        s.processPayment(x);
    }
}
