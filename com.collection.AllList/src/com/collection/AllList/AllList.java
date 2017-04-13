package com.collection.AllList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class AllList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// code for Arraylist - inserting elements and printing using dfor each method
	
		ArrayList<String> al = new ArrayList<String>();

//System.out.println("initial size of ArrayList is :- " + al.size());
		al.add("hi");
		al.add("hi1");
		al.add(null);
		al.add("hi3");
		al.add("hi4");
		
		
		PrintElement.printElementsUsingIterator(al);
		PrintElement.printElementsUsingListIteratr(al);
		PrintElement.printElementsUsingEnumeration(al);
		
	
		
//***********************************************************************************************

		
		// code for linked list -- inserting elements
		
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("ll1");
		ll.add("ll2");
		ll.add("ll3");
		ll.add("ll4");
		ll.add("ll5");
		ll.addFirst("Head");
		ll.addLast("Tail");
		
		PrintElement.printElementsUsingIterator(ll);
		PrintElement.printElementsUsingListIteratr(ll);
		PrintElement.printElementsUsingEnumeration(ll);
		
	
		
	//*********************************************************************************************************
		
// code for  vector -- inseriting elements
		
		Vector<Integer> v = new Vector<Integer>();
		
		for(int i=0;i<10;i++)
		{
			v.addElement(i);
		}
	
		PrintElement.printElementsUsingIterator(v);
		PrintElement.printElementsUsingListIteratr(v);
		PrintElement.printElementsUsingEnumeration(v);
		
		
	//**********************************************************************************************************
		
// code for stack -- inserting elements
		
		Stack<Character> st = new Stack<Character>();
		
		
		for(char j=97;j<107;j++)
		{
			st.push(j);
		}
		
		PrintElement.printElementsUsingIterator(st);
		PrintElement.printElementsUsingListIteratr(st);
		PrintElement.printElementsUsingEnumeration(st);
		
//*****************************************************************************************************************
	}

}

class PrintElement
{
	public static void printElementsUsingIterator(Collection al)
	{
		if(checkForNull(al))
			return ;
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	
	
	private static boolean checkForNull(Collection collection) {
		// TODO Auto-generated method stub
		try
		{
			if(null==collection)
		
			throw new NullPointerException("You have passed null object");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}


	public static void printElementsUsingListIteratr(List ll)
	{
		if(checkForNull(ll))
			return;
		ListIterator lit = ll.listIterator();
		while (lit.hasNext())
		{
			System.out.println(lit.next());
		}
	}
	
	
	public static void printElementsUsingEnumeration(Collection c)
	{
		if(checkForNull(c))
			return;
		 if (c instanceof Vector) {

			 Vector v = (Vector) c;
			 printEnum(v);
			 
		}
		 
		 else if(c instanceof Stack)
		 {
			 Stack s = (Stack) c;
			 printEnum(s);
		 } else
			try {
				throw new YouAreUsingEnum("Please pass only Enum Objects");
			} catch (YouAreUsingEnum e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}


	private static void printEnum(Vector v) {
		// TODO Auto-generated method stub
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
	}
	
	
	
	
}