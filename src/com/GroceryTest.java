package com;

public class GroceryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GroceryList list = new GroceryList();
		list.addgroceryList("Tea");
		list.addgroceryList("Milk");
		list.addgroceryList("salt");
		
		list.removeItemsGroceryList("salt");
		
		list.viewList();
		
	}

}
