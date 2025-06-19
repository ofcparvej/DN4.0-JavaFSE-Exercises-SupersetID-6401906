import AdapteeImpl.Paypal;
import AdapteeImpl.Stripe;
import Adapters.PayPalAdapter;
import Adapters.StripeAdapter;
import IPaymentProcessorAdaptee.PaymentProcessor;

public class Test {
    public static void main(String[] args) {
        PaymentProcessor p1 = new PayPalAdapter(new Paypal());
        PaymentProcessor s1 = new StripeAdapter(new Stripe());

        p1.processPayment(100.12);
        s1.processPayment(99.99);
    }
}
