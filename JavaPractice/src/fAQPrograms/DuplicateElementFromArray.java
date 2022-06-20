package fAQPrograms;

public class DuplicateElementFromArray {

	public static void main(String[] args) 
	{
		  int [] arr = {2,5,6,7,11,8,2,9};  
		   
	        System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }  
	}

}
