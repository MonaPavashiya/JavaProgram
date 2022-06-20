package fAQPrograms;

import java.util.ArrayList;
import java.util.Iterator;


public class DividedBy5n {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(7);
		list.add(15);
		list.add(27);
		list.add(118);
		list.add(25);

		Iterator<Integer> itr = list.iterator();

		System.out.println("List before removal");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}

		while (itr.hasNext()) {
			if (itr.next() % 5 == 0)
				itr.remove();
		}

		System.out.println("\nList after removal");

		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j) + " ");
		}

	}
}