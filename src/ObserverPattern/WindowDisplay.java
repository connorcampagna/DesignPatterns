package ObserverPattern;

public class WindowDisplay implements Observer {
    public void update(float temperature) {
        System.out.println("Window Display: Showing new temp: " + temperature + " degrees.");
    }
}