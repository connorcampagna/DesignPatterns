package DecoratorPattern;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    // The decorator wraps around a Coffee object passed into its constructor
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }
}