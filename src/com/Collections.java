package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
	
		List<String> list=new ArrayList<String>();  

		list.add("India");
		list.add("China");
		list.add("US");
		list.add("Indonesia");
		list.add("Pakistan");
		
		System.out.println(list.get(0));
		
		int [] nums = {1,2,3,4,5,6,7,8,9,10};		
		System.out.println(nums[2]+nums[4]);
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("New York City",8804190);
		map.put("Los Angeles",3898747);
		map.put("Chicago",2746388);
		map.put("Houston", 2304580);
		map.put("Phoenix", 1608139);
		
		 Set<String> topTouristAttractions = new HashSet<>();
				 topTouristAttractions.add("Eiffel Tower, France");
	        topTouristAttractions.add("Great Wall of China, China");
	        topTouristAttractions.add("Machu Picchu, Peru");
	        topTouristAttractions.add("Statue of Liberty, USA");
	        topTouristAttractions.add("Taj Mahal, India");
	        topTouristAttractions.add("Grand Canyon, USA");
	        topTouristAttractions.add("Louvre Museum, France");
	        topTouristAttractions.add("Christ the Redeemer, Brazil");
	        topTouristAttractions.add("Colosseum, Italy");
	        topTouristAttractions.add("Disneyland, USA");

	        // Print the size of the set
	        System.out.println("Size of the set: " + topTouristAttractions.size());
	    }	 
	
}
	
	

