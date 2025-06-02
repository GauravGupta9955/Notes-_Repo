package CodingQuestion;

import java.util.ArrayList;

//Find first and last element of Arraylist
public class ToFindtheFirstandlastElementFromtheList {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		arrayList.add("Date");
		arrayList.add("Elderberry");
		
		System.out.println(arrayList.getFirst());
		System.out.println(arrayList.getLast());
	}

}
