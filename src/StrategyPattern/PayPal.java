package StrategyPattern;

public class PayPal implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Payment of " + amount + " paid VIA PAYPAL.");
    }
}
