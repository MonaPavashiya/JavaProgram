package fAQPrograms;

public class LargestNumberFromArray {

	public static void main(String[] args) 
	{
		
        int [] arr = new int [] {5,6,3,9,25,234,7,2};  //Initialize array  
         
        int max = arr[0];  //Initialize max with first element of array. 
        
        for (int i = 0; i < arr.length; i++) {  
             
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  
		
}


