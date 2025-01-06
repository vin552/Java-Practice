package com;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hike {

	public static void main(String[] args) {

	//Hike percentage of Alice Johnson
		
		String empname ="Alice Johnson";
		int basesalary=75000;
		int exp =5;
		float rating = 4.2f;
		int variablepaypercentage=15;
		int bonus =1500;
		int reward =5000;
	
	float hike = (basesalary * variablepaypercentage ) + bonus+reward ;
	float alicehikeper = hike/basesalary;
		System.out.println(alicehikeper);
		
		//Hike percentage of Bob Smith
		float bobhike = (68000 * 10 ) + 1200 ;
		float bobhikeper=bobhike/68000;
		System.out.println(bobhikeper);
		//Hike percentage of Carol Davis
		float davushike = (82000 * 15 ) + 1500 +5000;
		float davishikeper=davushike/82000;
		
		//Hike percenrage of David Brown
		float brownhike =(90000 * 3 ) + 300 +5000;
		float brownhikeper=brownhike/90000;
		
		//Hike percenrage of Eva Green
		float evahike =(60000 * 3 ) + 1200;
		float evahikeper=evahike/60000;
		
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("Alice",(int) alicehikeper);
        map.put("Bob",(int) bobhikeper);
        map.put("davis",(int) davishikeper);
        map.put("brown",(int) brownhikeper);
        map.put("eva",(int) evahikeper);
        
        for(Entry<String, Integer> m : map.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
	}
	}
	
}
