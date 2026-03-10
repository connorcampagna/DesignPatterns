package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    // When the weather changes, we update the state and notify everyone.
    public void setTemperature(float temp) {
        this.temperature = temp;
        System.out.println("\nWeatherStation: New temperature is " + temp);
        notifyObservers();
    }
}

class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        // Create the displays
        PhoneDisplay myPhone = new PhoneDisplay();
        WindowDisplay myWindow = new WindowDisplay();

        // Subscribe them to the weather station
        station.registerObserver(myPhone);
        station.registerObserver(myWindow);

        // The station changes temperature, and both displays update automatically!
        station.setTemperature(72.5f);

        // Output:
        // WeatherStation: New temperature is 72.5
        // Phone Display: Temperature updated to 72.5 degrees.
        // Window Display: Showing new temp: 72.5 degrees.
    }
}