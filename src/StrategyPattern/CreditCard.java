package StrategyPattern;

public class CreditCard implements PaymentStrategy {

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
