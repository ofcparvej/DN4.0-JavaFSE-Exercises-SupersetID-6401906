public class Test {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();


        context.setPaymentStrategy(new PayPalPayment("abc@gmail.com"));  // current Payment Strategy is PayPal Payment method
        context.executePayment(199.99);

        System.out.println("After Changing The Payment method ");
        context.setPaymentStrategy(new CreditCardPayment("111122233334567")); // Payment mode changed ....
        context.executePayment(20000.00);


    }
}
