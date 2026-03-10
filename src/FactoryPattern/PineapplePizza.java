package FactoryPattern;

public class PineapplePizza implements Pizza {
    public void getName() {
        System.out.println("Pineapple Pizza");
    }

    public void prepare() {
        System.out.println("Preparing Pineapple Pizza");
    }

    public void bake() {
        System.out.println("Baking Pineapple Pizza");
    }

    public void cut() {
        System.out.println("Cutting Pineapple Pizza");
    }

    public void box() {
        System.out.println("Boxing Pineapple Pizza");
    }
}
