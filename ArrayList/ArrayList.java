package String;

import java.util.Iterator;

public class ArrayList {

	public static void main(String[] args) 
	{
		java.util.ArrayList<Integer> a=new java.util.ArrayList<Integer>();
		a.add(12);
		a.add(10);
		a.add(20);
		System.out.println("using list obj directly : ");
		System.out.println(a);
		System.out.println();
		
		//way 2
		
		System.out.println("using enhance forloop : ");
		for (Integer i : a) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		//way 3
		System.out.println("using for loop size and get method");
		for (int i = 0; i < a.size(); i++) 
		{
		System.out.print(a.get(i)+" ");	
		}
	}

}
