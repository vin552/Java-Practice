package com;

public class EmpGroups {

	public static void main(String[] args) {
	
	Employees emp = new Employees();
	
	String[] empnames = {emp.empname1,emp.empname2,emp.empname3};
	int [] empids = {emp.empid,emp.empid2,emp.empid3}; 
	
	System.out.println("Employee Name:" +empnames[0] +"," +"Employee ID:" + empids[0]);
	System.out.println("Employee Name:" +empnames[1] +"," +"Employee ID:" + empids[1]);
	System.out.println("Employee Name:" +empnames[2] +"," +"Employee ID:" + empids[2]);
}
}