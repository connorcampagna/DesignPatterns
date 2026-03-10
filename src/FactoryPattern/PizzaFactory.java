package FactoryPattern;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            return new CheesePizza();
        } else if (type.equalsIgnoreCase("pineapple")) {
            return new PineapplePizza();
        } else {
            throw new IllegalArgumentException("Invalid pizza type: " + type);
        }
    }
}
