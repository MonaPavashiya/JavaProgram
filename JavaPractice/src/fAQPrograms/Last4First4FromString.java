package fAQPrograms;

public class Last4First4FromString {

	public static void main(String[] args) 
	{
	
		String str = "www.erostrum.com";
		
		String firstFour = str.substring(0,4);
		System.out.println(firstFour);  //www.
		
		String lastFour = str.substring(str.length()-4,str.length());
		System.out.println(lastFour); //.com
		
		String website= str.substring(4, str.length()-4);
		System.out.println(website);  //erostrum
	}

}
