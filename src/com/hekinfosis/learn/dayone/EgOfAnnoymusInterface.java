package com.hekinfosis.learn.dayone;

public class EgOfAnnoymusInterface{
	
	String instArg = " Instance Variable";
	static String statArg = " Static Variable";
	
	public static void main(String[] args) {
		
		final String locArg = " Local variable";
		
		SmokingClientThree interThree1 = (arg1, arg2) -> 
		{ String resu = arg1 + "  " + arg2;
		  System.out.println("Iam Using Local Variable" + locArg);
//		  System.out.println("Iam Using Instance Variable" + instArg);
		  System.out.println("Iam Using Static Variable" + statArg);
		  
			return null;};
			 statArg = " New Static Variable";
	//		 instArg = " New Instance Variable";
	//		 locArg = " New Local variable";
			 interThree1.sampleInterfaceThree(locArg, statArg);
		
		
		
		
				
		RuleInterfaceOne interOne = () -> {System.out.println("Iam in Interface one which has no Arg and no return");};
		interOne.sampleInterface();
		
		NonSmokingClientTwo interTwo = arg1 -> {System.out.println(arg1 + " Iam in Interface two which has one Arg and no return");}; 
				interTwo.sampleInterfaceTwo("Hello");
				
		SmokingClientThree interThree = (arg1, arg2) -> 
		{  String result = arg1 + " " + " I am in Interface Three which has two args and String Return" + arg2;
			return result;};
			
				
			String res = interThree.sampleInterfaceThree("hello" , "  ");
			System.out.println(res);
			
			PoliticallyExposedClientsFour interFour = () -> {System.out.println("Iam in Interface four which has no Arg and no return");};
	
			interFour.sampleInterfaceFour();
			interFour.sampleInterFive("Hello");
			PoliticallyExposedClientsFour.sampleInterSix("hello", "hey");

	}

	

}
