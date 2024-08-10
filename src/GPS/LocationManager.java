package GPS;

import java.util.ArrayList;

public class LocationManager {
    private ArrayList<Location> locations;

    // Constructor
    public LocationManager() {
        locations = new ArrayList<>();
    }

    // Method to add a location
    public void addLocation(double latitude, double longitude) {
        Location location = new Location(latitude, longitude);
        locations.add(location);
    }

    // Method to get all locations
    public ArrayList<Location> getLocations() {
        return locations;
    }

    // Optional: Method to print all locations
    public void printLocations() {
        for (Location location : locations) {
            System.out.println(location);
        }
    }

    public static void main(String[] args) {
        // Example usage
        LocationManager locationManager = new LocationManager();
        locationManager.addLocation(37.7749, -122.4194); // San Francisco
        locationManager.addLocation(34.0522, -118.2437); // Los Angeles

        locationManager.printLocations(); // Print all locations
    }
}

