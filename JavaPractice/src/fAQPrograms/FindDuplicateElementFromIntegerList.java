package fAQPrograms;

public class FindDuplicateElementFromIntegerList {

	public static void main(String[] args) 
	{
		int arr[] = {10, 28, 87, 10, 20, 76, 28, 80};

		System.out.println("Duplicate elements in given array : ");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);

			}
		}
	}
}