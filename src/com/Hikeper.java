package com;

import java.util.HashMap;
import java.util.Map;

public class Hikeper {

	
	public static void main(String[] args) {
		
		String [] names = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		double []baseSalaries = {75000, 68000, 82000, 90000, 60000};
		int []exps= {5, 3, 7, 10, 2};
		double[] ratings= {4.2, 3.8, 4.5, 2.0, 3.5};
		
		Map<String,Double> emphikeperent = new HashMap<>();
		
		for (int i=0;i<names.length;i++)
		{
		String name =names[i];
		double baseSalary=baseSalaries[i];
		int exp=exps[i];
		double rating=ratings[i];
		
		
		//Rating condition, Variable pay, Bonus
		
		int variablePay;
		int bonus;
		int reward;
		
		if(rating>=4) {
			
			variablePay=15;
			bonus=1500;
		}
		else if(rating>=3 && rating<4) {
			variablePay=10;
			bonus=1200;
		}
		else if(rating<3) {
			
			variablePay=3;
			bonus=300;
			
		}
		else {
			variablePay=0;
			bonus=0;
		}
	//Reward
		if(exp>=5) 
			reward=5000;
			else 
				reward=0;
			
		// Hike Calculation
		
		double hike;
		 hike =(baseSalary*variablePay/100)+bonus+reward;
		 double hikepercentage;
		 hikepercentage = (hike/baseSalary)*100;
		 
		 emphikeperent.put(name, hikepercentage);
		
		}	
		
		for(Map.Entry<String,Double> entry: emphikeperent.entrySet() )
		{
			System.out.println(entry.getKey() + ": " + entry.getValue()+"%" );
		}
		
	}
}

