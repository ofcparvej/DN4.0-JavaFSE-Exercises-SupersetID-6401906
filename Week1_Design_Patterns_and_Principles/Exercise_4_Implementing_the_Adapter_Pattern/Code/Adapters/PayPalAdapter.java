package Adapters;

import AdapteeImpl.Paypal;
import IPaymentProcessorAdaptee.PaymentProcessor;

public class PayPalAdapter implements PaymentProcessor {
    private Paypal p;

    public PayPalAdapter(Paypal p){
        this.p = p;
    }

    @Override
    public void processPayment(double x){
        p.processPayment(x);
    }
}
