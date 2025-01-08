package com;

import java.util.ArrayList;

public class GroceryList {
	
	ArrayList<String> grocery=new ArrayList<String>();
	
	public void addgroceryList(String item) {
		
		grocery.add(item);
			System.out.println(item);	
		
	}
	
	 public void removeItemsGroceryList(String item) {

	        System.out.println("***Remove operation performed***");
	        grocery.remove(item);

	    }
	 
	 public void viewList() {

	        System.out.println("***list is as follows***");
	        System.out.println(grocery);
	    }
}