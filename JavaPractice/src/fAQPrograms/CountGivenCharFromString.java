package fAQPrograms;

public class CountGivenCharFromString {

	public static void main(String[] args) 
	{
		String str = "java is object oriented language";
		
		int result = str.length()-str.replaceAll("a", "").length(); // it talks about a character
		System.out.println(result);
	}

}
