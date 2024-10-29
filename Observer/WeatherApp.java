package Observer;

public class WeatherApp {
    public static void main(String[] args) {
        // Create the weather station (subject)
        WeatherStation weatherStation = new WeatherStation();

        // Create observers
        // Observer phoneDisplay = new PhoneDisplay();
        // Observer websiteDisplay = new WebsiteDisplay();

        // Add observers to the weather station
        // weatherStation.addObserver(phoneDisplay);
        // weatherStation.addObserver(websiteDisplay);

        // Change temperature (observers will be notified)
        // weatherStation.setTemperature(25);  // Output: Phone and Website displays are updated
        // weatherStation.setTemperature(30);  // Output: Phone and Website displays are updated

        // Remove phone display and update again
        // weatherStation.removeObserver(phoneDisplay);
        // weatherStation.setTemperature(35);  // Only website display is updated
    }
}

