package fAQPrograms;

public class ReverseEachWordFromString {

	public static void main(String[] args) 
	{
		String str = "How are you";

		String result = "";
		String[] arr = str.split("\\s");
		
		for(String word : arr)
		{
			String reverseWord = "";
			int j = word.length();
			while (j>0)
			{
				char ch = word.charAt(j-1);
				reverseWord = reverseWord + ch;
				j--;
			}
			result = result + reverseWord + " ";
		}
		System.out.println(result);
	}

}
