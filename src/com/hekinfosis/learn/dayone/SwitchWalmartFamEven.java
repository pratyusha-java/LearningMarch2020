package com.hekinfosis.learn.dayone;

public class SwitchWalmartFamEven {

	public static void main(String[] args) {
		
		int age = 10;
		
		switch(age)
		{
		case 5: 
		{
			System.out.println("Distribute a toy for the age of 5");
			break;
		}
		case 10: 
		{
			System.out.println("Distribute Electronic toy for age of 10");
			break;
		}
		case 18:
		{
			System.out.println("Distribute Book for age of 18");
			break;
			
		}
		case 21:
		{
			System.out.println("Distribute Alcohol for age of 21");
			break;
		}
		case 40:
		{
			System.out.println("Distribute Wine Bottle for age of 40");
			break;
		}
		default:
		System.out.println("There is no AGE");
		}
		
	}


}
