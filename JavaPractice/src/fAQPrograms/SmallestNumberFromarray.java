package fAQPrograms;

public class SmallestNumberFromarray {

	public static void main(String[] args) {
		   
        int [] arr = new int [] {5,6,3,9,25,234,7,2};  //Initialize array 
         
        int min = arr[0];   //Initialize min with first element of array.
        
        for (int i = 0; i < arr.length; i++) {  
              
           if(arr[i] <min)  
               min = arr[i];  
        }  
        System.out.println("Smallest element present in given array: " + min);  
    }  

	}


