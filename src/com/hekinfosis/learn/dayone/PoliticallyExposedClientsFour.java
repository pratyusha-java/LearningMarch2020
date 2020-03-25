package com.hekinfosis.learn.dayone;

public interface PoliticallyExposedClientsFour {
	
	public void sampleInterfaceFour();
	
	
	default public void sampleInterFive(String arg1) {
		
		System.out.println(arg1 + " Iam in the Interface Default Method");
		
	}
	
	static public void sampleInterSix(String arg1, String arg2)
	{
	  String result = arg1 + " " + arg2;
	  System.out.println("Iam in Interface satic Method " +  result);
	  
	}

}
