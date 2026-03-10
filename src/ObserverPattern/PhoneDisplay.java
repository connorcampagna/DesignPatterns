package ObserverPattern;

public class PhoneDisplay implements Observer {
    public void update(float temperature) {
        System.out.println("Phone Display: Temperature updated to " + temperature + " degrees.");
    }
}