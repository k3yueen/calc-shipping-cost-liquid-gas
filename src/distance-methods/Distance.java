//Roza Antonevici
package distance_methods;

import java.util.HashMap;
import java.util.Map;

public class Distance {
    private Map<String, Double> cityDistances;
    
    public Distance() {
        cityDistances = new HashMap<>();
        initializeDistances();
    }
    
    private void initializeDistances() {
        cityDistances.put("Berlin", 255.33);
        cityDistances.put("Munich", 603.35);
        cityDistances.put("Leipzig", 292.5);
        cityDistances.put("Dresden", 381.71);
        cityDistances.put("Cologne", 354.14);
        cityDistances.put("Rome", 1309.81);
        cityDistances.put("Paris", 745.02);
        cityDistances.put("Vienna", 740.93);
        cityDistances.put("Madrid", 1783.87);
        cityDistances.put("Bucharest", 1549.21);
    }
    
    public double getDistance(String city) {
        return cityDistances.getOrDefault(city, 0.0);
    }
    
    public void addCity(String city, double distance) {
        cityDistances.put(city, distance);
    }
    
    public void printAllDistances() {
        System.out.println("Distances from Hamburg");
        for (Map.Entry<String, Double> entry : cityDistances.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " km");
        }
        System.out.println("made by Roza");
    }
}
