package fAQPrograms;

public class ReverseWordsInSentence {

	public static void main(String[] args) 
	{
		String str = "we are learing java";
		String result = "";
		
		String[] arr = str.split("\\s");
		
		for(int i =arr.length-1; i>=0; i--)
		{
			result = result + arr[i] + " ";
		}
		System.out.println(result);

	}

}
