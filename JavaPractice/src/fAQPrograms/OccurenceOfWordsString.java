package fAQPrograms;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWordsString {

	public static void main(String[] args) {
		String str = "Hi my name is mona. I am doing QA class. I will give my 100%."
				+ " If i will give 100% then and then i will get a job in automation testing "
				+ "field. I would love to work in this field. ";
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer count = 1;
		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		for (String x : map.keySet()) {
			System.out.println("The count of word : " + x + "=" + map.get(x));
		}
	}
}
