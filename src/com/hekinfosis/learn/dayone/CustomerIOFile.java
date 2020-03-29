package com.hekinfosis.learn.dayone;

import java.io.*;

public class CustomerIOFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fIn = null;
		BufferedReader bIn = null;
//		FileWriter fOut = null;
//		BufferedWriter bOut = null;
		String filePath =  "C:\\JAVA\\";
		String fileName = "CustomerFile.txt";
		
		try {
			fIn = new FileReader(filePath+fileName);
			bIn = new BufferedReader(fIn);
			String rLine ;
			while((rLine = bIn.readLine())!=null)
			{
				Customer cust1 = new Customer();
				String[] str = rLine.split(" ");
				
				cust1.setsNo(Integer.parseInt(str[0]));
				System.out.println(cust1.getsNo());
				cust1.setCusid(str[1]);
				System.out.println(cust1.getCusid());
				cust1.setCusFirstName(str[2]);
				System.out.println(cust1.getCusFirstName());
				cust1.setCusLastName(str[3]);
				System.out.println(cust1.getCusLastName());
			
				cust1.setCusTimeEnter(Integer.parseInt(str[4]));
				System.out.println(cust1.getCusTimeEnter());
				
				cust1.setCusTimeExit(Integer.parseInt(str[5]));
				System.out.println(cust1.getCusTimeExit());
				
					
				}
			
			
		}catch(IOException E) {
			
			System.out.println("Error in the file ");
		}finally {
			fIn.close();
			bIn.close();
		}
		
	}

}
