package com.hekinfosis.learn.dayone;

public class Assignoperator {

	public static void main(String[] args) {
		
		int firstvar = 200;
		int secondvar = 100;
		int thirdvar = 1000;
		String stringval = "HI MY NAME IS PRATYU";
		String strinval2 = "hi my name is pratyu";
		
		//Equals String
		boolean result, result2;
		result = stringval.equals(strinval2);
		result2 = stringval.equalsIgnoreCase(strinval2);
		System.out.println("Result of equals two string  : " + result);
		System.out.println("Result of equals two string by ignoring case  : " +  result2);
		
		
		// Arthamatic operator
		System.out.println("Adding :  " + (firstvar + secondvar));
		System.out.println("Sub :  " + (firstvar - secondvar) );
		System.out.println("Division:  " + (firstvar / secondvar));
		System.out.println("Module :  " + (firstvar % secondvar));

		//   increment
		System.out.println("Post increment first var - firstvar -- " + firstvar++);
		System.out.println("value of first var after increment ::" +firstvar );
		System.out.println("Before using increment second var -  " + secondvar);
		System.out.println("pre increment second var -  " + --secondvar);
		System.out.println("second var -  " + secondvar);

		//Decrement
		
		System.out.println("Post decrement first var - firstvar -- " + firstvar--);
		System.out.println("value of first var after decrement ::" +firstvar );
		System.out.println("Before using decrement second var -  " + secondvar);
		System.out.println("pre decrement second var -  " + --secondvar);
		System.out.println("second var -  " + secondvar);
		
		
	}

}
