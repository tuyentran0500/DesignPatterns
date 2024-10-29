### Why the Normal Way Doesn’t Work

Let’s say we have a weather station that records temperature and wants to notify different displays (like a phone display, a website, etc.) whenever the temperature changes. A **normal way** to do this is to hard-code the logic in the weather station to call each display whenever the temperature changes:

```java
public class WeatherStation {
    private PhoneDisplay phoneDisplay;
    private WebsiteDisplay websiteDisplay;

    public WeatherStation(PhoneDisplay phoneDisplay, WebsiteDisplay websiteDisplay) {
        this.phoneDisplay = phoneDisplay;
        this.websiteDisplay = websiteDisplay;
    }

    public void setTemperature(int temperature) {
        // Update displays manually
        phoneDisplay.update(temperature);
        websiteDisplay.update(temperature);
    }
}
```

This works, but here’s why it **doesn’t scale**:

1. **Tight Coupling**: The weather station is tightly coupled to the `PhoneDisplay` and `WebsiteDisplay`. Adding a new display type (e.g., a tablet display) requires modifying the `WeatherStation` class.
2. **Limited Flexibility**: It’s difficult to add or remove displays dynamically (like when a user subscribes or unsubscribes).
3. **Violates Open-Closed Principle**: Every time a new display is added, we have to change the `WeatherStation` class, violating the principle that classes should be open for extension but closed for modification.

### The Observer Pattern Fixes This Problem

With the Observer Pattern, the `WeatherStation` (subject) does not need to know about the specific displays (observers). It just maintains a list of observers and notifies them whenever the temperature changes.

### Simple Example with the Observer Pattern

**Step 1: Define the Observer Interface** 

This interface defines the `update()` method that all observers will implement

```java
public interface Observer {
	void update(int temperature);
}
```

**Step 2: Create Observer Pattern**

Each observer implements the `Observer` interface.

```java
// Phone display (an observer)
public class PhoneDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Phone display: Current temperature is " + temperature + "°C");
    }
}

// Website display (an observer)
public class WebsiteDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Website display: Current temperature is " + temperature + "°C");
    }
}

```

**Steps 3: Define the Subject Interface**

The subject will manage a list of observers and notify them when its state (temperature) changes.

```java
public interface Subject {
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
}
```

**Step 4: Create Concreate Subject (Weather Station)**

```java
import java.util.ArrayList;
import java.util.List;

// WeatherStation (subject)
public class WeatherStation implements Subject {
    private List<Observer> observers;
    private int temperature;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    // Add an observer
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove an observer
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify all observers
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    // Update temperature and notify observers
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();  // Notify all observers of the change
    }
}

```

**Step 5: User the Observer Pattern**

Now, the weather station can add or remove observers dynamically and notify them of temperature changes.

```java
public class WeatherApp {
    public static void main(String[] args) {
        // Create the weather station (subject)
        WeatherStation weatherStation = new WeatherStation();

        // Create observers
        Observer phoneDisplay = new PhoneDisplay();
        Observer websiteDisplay = new WebsiteDisplay();

        // Add observers to the weather station
        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(websiteDisplay);

        // Change temperature (observers will be notified)
        weatherStation.setTemperature(25);  // Output: Phone and Website displays are updated
        weatherStation.setTemperature(30);  // Output: Phone and Website displays are updated

        // Remove phone display and update again
        weatherStation.removeObserver(phoneDisplay);
        weatherStation.setTemperature(35);  // Only website display is updated
    }
}

```

### Why the Observer Pattern Works Better:

1. **Loose Coupling**: The `WeatherStation` (subject) doesn’t need to know the specific details of its observers (displays). It only interacts with the `Observer` interface, making it flexible and reusable.
2. **Scalability**: We can add or remove observers dynamically without changing the `WeatherStation` code, following the **Open-Closed Principle**.
3. **Reusability**: The same observer can be reused by different subjects, or one subject can notify multiple observers of different types.
4. **Flexibility**: You can change the number of observers at runtime, such as users subscribing or unsubscribing from updates.