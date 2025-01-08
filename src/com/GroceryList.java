package com;

import java.util.ArrayList;

public class GroceryList {

	
	public void groceryList() {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Sugar");
		list.add("Teapowder");
		list.add("Milk");
		list.add("salt");
				
		list.remove(3);
		
		System.out.println(list);
	}
}