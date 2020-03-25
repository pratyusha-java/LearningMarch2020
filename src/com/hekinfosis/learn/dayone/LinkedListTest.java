package com.hekinfosis.learn.dayone;

import java.util.*;
//import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
	//	ArrayList<String> arrayli = new ArrayList<String>();
	// LinkList.add
		LinkedList<String> linkList = new LinkedList<String>();
		linkList.add("Book");
		linkList.add("Notebook");
		linkList.add("Pen");
		linkList.add("Pencil");
		System.out.println(linkList);
		linkList.add(2 , "keys");
		linkList.add(4, "phone");
		System.out.println("After Adding keys and phone " + linkList);
		
	//LinkList.size
		int size = linkList.size();
		System.out.println("Size of Linklist : " + size);
		
	//LinkList.remove
		linkList.remove(3);
		System.out.println("After Removing one element: " +  linkList);
		
	// LinkList.Contains and iteration 
		System.out.println("Checking the pencil : " + linkList.contains("Pencil"));
		
		if (linkList.contains("Pencil"))
		{
			for(String linkListValue : linkList)
			{
				System.out.println(" Iam in for Loop : " + linkList);
			
			}
		}
		else
		{
			linkList.add("Pencil");
			System.out.println(" Iam  in Else and adding pencil :" + linkList );
		
		
		
		
		

	}

	}
}
