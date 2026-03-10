package StrategyPattern;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // We can swap the strategy out at runtime using this setter
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int totalAmount) {
        // The cart delegates the actual work to the injected strategy
        paymentStrategy.pay(totalAmount);
    }
}