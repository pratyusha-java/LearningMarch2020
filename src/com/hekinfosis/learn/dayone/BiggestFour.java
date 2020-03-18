package com.hekinfosis.learn.dayone;

public class BiggestFour {
	public static void main(String[] args) {
		
		int firstNum = 100;
		int secondNum = 2000;
		int thirdNum = 300;
		int fourthNum = 400;
		if ((firstNum > secondNum)&&(firstNum >thirdNum)&&(firstNum >fourthNum))
		{
			System.out.println("print First NUmber is greater : "+ firstNum);	
		}
		else if((secondNum > thirdNum) && (secondNum > fourthNum)) 
		{
			System.out.println("print second number is greater : " + secondNum);
		}
		else if (thirdNum > fourthNum)
		{
			System.out.println("print third number is greater : " + thirdNum);	
		}
		else 
		{
			System.out.println("print fourth number is greater : " + fourthNum);
		}
	}
}

