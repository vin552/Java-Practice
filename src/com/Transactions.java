package com;

public class Transactions {

	public static void main(String[] args) {

		
		double [] nums = {50000,-2000,3000,-15000,-200,-300,4000,-3000};		
		
		
		int count =0;
		double num1=0;
		for(int i=0;i<nums.length;i++)
			
			
			
		{
			
			if(nums[i]>0) {
						
					count++;	
				double num2=nums[i]+num1;
				
				num1=num2;
				
				
				
				
			}
		}
		System.out.println("no. of transactions credited,"+num1);
		System.out.println(count);

		
		double debitnum1=0;
		int debitcount=0;
 
		for(int i=0;i<nums.length;i++)
			
			
		{
			
			if(nums[i]<0) {
				debitcount++;			
				double debitnum2=nums[i]+debitnum1;
				
				debitnum1=debitnum2;
				
			}
			
		}
		System.out.println("no. of transactions debited,"+debitnum1);
		System.out.println(debitcount);
		
		double remainingamount = num1+debitnum1;
		System.out.println("remaining amount,"+remainingamount);
		
		
int suscount=0;
		for(int i=0;i<nums.length;i++)
			
			
		{
	if (nums[i]>=10000 || nums[i]<=-10000)
			{
		suscount++;
		System.out.println("Suspicious credit/ debit Transaction with Amount,"+nums[i]);
			}
	}
	      System.out.println("Total no of Suspicious credit/ debit Transaction with Amount,"+suscount);

}
}
