package com.ArraysCollectionassignments;

import java.util.HashMap;
import java.util.Map;

public class LargestCities {

	public static void main(String[] args) {

		Map<String, Integer> cities = new HashMap<>();

        // Add the 5 largest cities and their populations 
		
        cities.put("New York", 8419600);  // Population of New York City
        cities.put("Los Angeles", 3980400);  // Population of Los Angeles
        cities.put("Chicago", 2716000);  // Population of Chicago
        cities.put("Houston", 2328000);  // Population of Houston
        cities.put("Phoenix", 1690000);  // Population of Phoenix

        // Display the map content
        
        for (Map.Entry<String, Integer> entry : cities.entrySet()) {
            System.out.println("City: " + entry.getKey() + ", Population: " + entry.getValue());
        }
    }

		
	}


