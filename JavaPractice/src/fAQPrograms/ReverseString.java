package fAQPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		  String string = "Java is my favourite language";      
	      String reversedStr = "";    
	        
	        for(int i = string.length()-1; i >= 0; i--)
	        {    
	            reversedStr = reversedStr + string.charAt(i);    
	        }    
	            
	        System.out.println("Reverse of given string: " + reversedStr);    
	    }    
}
