package FactoryPattern;

public class PizzaStore {

    public static void main(String[] args) {
        Pizza cheesePizza = PizzaFactory.createPizza("cheese");
        cheesePizza.getName();
        cheesePizza.prepare();
        cheesePizza.bake();
        cheesePizza.cut();
        cheesePizza.box();

        System.out.println();

        Pizza pineapplePizza = PizzaFactory.createPizza("pineapple");
        pineapplePizza.getName();
        pineapplePizza.prepare();
        pineapplePizza.bake();
        pineapplePizza.cut();
        pineapplePizza.box();
    }
}
