package fAQPrograms;



public class ManipulateArrayInJava
{

	public static void main(String[] args) 
	{
		String[] input = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "friday", "Saturday"};
		
		String[] output = new String[input.length];
		
		for(int i=0; i<input.length; i++)
		{
			output[i] = input[i].substring(0, 3); //  it will print only first 3 characters
				
		}
		for(String day : output)
		{
			System.out.println(day);
		}
	}
}
