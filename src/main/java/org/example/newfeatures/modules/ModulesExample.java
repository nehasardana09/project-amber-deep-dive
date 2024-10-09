package org.example.newfeatures.modules;


//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
import module java.base;

public class ModulesExample {

    void main(){
        // Create a HashMap with city names as keys and elevation heights as values
        HashMap<String, Integer> cityElevations = new HashMap<>();
        cityElevations.put("Denver", 5280);
        cityElevations.put("Aspen", 8000);
        cityElevations.put("Vail", 8150);
        cityElevations.put("Boulder", 5430);

        // Find the entry with the highest elevation
        Map.Entry<String, Integer> maxEntry = Collections.max(cityElevations.entrySet(), Map.Entry.comparingByValue());

        // Print the city with the highest elevation
        System.out.println("The city with the highest elevation is " + maxEntry.getKey() + " with an elevation of " + maxEntry.getValue() + " feet.");
    }
}
