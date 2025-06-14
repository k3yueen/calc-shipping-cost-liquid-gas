//Roza Antonevici
package distance_methods;

import java.util.*;

public class Distance {

  //This map holds the distances from Hamburg to other cities
  private Map<String, Double> cityDistances;

  /**
   *this constructor initializes the map and fills it with distances.
   */
  public Distance() {
    this.cityDistances = new HashMap<>();
    initializeCityDistances();  // Load predefined distances right away
  }

  /**
   *The section where i put the real distances from Hamburg to major cities from collected data
   */
  private void initializeCityDistances() {
    //These distances are all from Hamburg in km
    cityDistances.put("Berlin", 255.33);
    cityDistances.put("Munich", 603.35);
    cityDistances.put("Leipzig", 292.5);
    cityDistances.put("Dresden", 381.71);
    cityDistances.put("Köln", 354.14);
    cityDistances.put("Rome", 1309.81);
    cityDistances.put("Paris", 745.02);
    cityDistances.put("Vienna", 740.93);
    cityDistances.put("Madrid", 1783.87);
    cityDistances.put("Bucharest", 1549.21);
  }

  /**
   *this section allows me to add a new city and its distance
   */
  public void addCity(String city, double distance) {
    cityDistances.put(city, distance);
  }

  /**
   *Returns the distance to a given city from Hamburg
   *Automatically normalizes city names to be user proof in case someone misspells the city name because they skipped Geography classes
   */
  public double getDistance(String city) {
    String normalizedCity = normalizeCityName(city);
    if (!cityDistances.containsKey(normalizedCity)) {
      throw new IllegalArgumentException("City not found: " + city);
    }
    return cityDistances.get(normalizedCity);
  }

  /**
   *Checks if a given city is already in my cute little distance database
   */
  public boolean isValidCity(String city) {
    String normalizedCity = normalizeCityName(city);
    return cityDistances.containsKey(normalizedCity);
  }

  /**
   *this section returns the set of cities i currently logged in my shipping company
   */
  public Set<String> getAvailableCities() {
    return new HashSet<>(cityDistances.keySet());
  }

  /**
   *this ormalizes city names: first letter capital, rest lowercase as i said above
   *example: “berlin” - “Berlin” for dyslexical ppl
   */
  private String normalizeCityName(String city) {
    if (city == null || city.isEmpty()) {
      return city;
    }
    return city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase();
  }
}
