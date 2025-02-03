package com.ArraysCollectionassignments;

import java.util.HashSet;
import java.util.Set;

public class TouristAttractions {

	public static void main(String[] args) {

		
		// Create a HashSet to store the tourist attractions
        Set<String> attractions = new HashSet<>();

        // Add the top 10 most visited tourist attractions in the world
        
        attractions.add("Great Wall of China");
        attractions.add("Eiffel Tower, Paris");
        attractions.add("Louvre Museum, Paris");
        attractions.add("Statue of Liberty, USA");
        attractions.add("Colosseum, Rome");
        attractions.add("Machu Picchu, Peru");
        attractions.add("Taj Mahal, India");
        attractions.add("Christ the Redeemer, Brazil");
        attractions.add("Pyramids of Giza, Egypt");
        attractions.add("Disneyland Park, USA");

        // Print the size of the set
       
        System.out.println("The number of top tourist attractions: " + attractions.size());
        
        
    }
}
	
