package MultiThreading;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class flatmap1 {
	public static void main(String[] args) {
		String s = "helloworld";
		int size =0;
		ArrayList<String> arr = new ArrayList<>();
		int length =s.length()-1;
		for(int i =0;i<=length;i++) {
			if(arr.contains(String.valueOf(s.charAt(i)))) {
				System.out.println(arr);
				break;
			}
			
			String s1 =String.valueOf(s.charAt(i));
			arr.add(s1);
	}
	
}
}
