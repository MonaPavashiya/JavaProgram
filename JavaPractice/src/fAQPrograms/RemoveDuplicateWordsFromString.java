package fAQPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsFromString 
{

	public static void main(String[] args) 
	{
		String input = "I am am Mona Mona";
		
		String[] inputArr = input.split(" ");
		
		Set<String> mySet = new LinkedHashSet<String>();
		
		for(String x : inputArr)
		{
			mySet.add(x);
		}
		
		Iterator itr = mySet.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
	}
}
