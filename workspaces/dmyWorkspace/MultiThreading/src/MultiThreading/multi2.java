package MultiThreading;

import java.util.ArrayList;

public class multi2  {
	public static void main(String[] args) {
			String s = "helloworld";
			int size =0;
			ArrayList<String> arr = new ArrayList<>();
			int length =s.length()-1;
			for(int i =0;i<=length;i++) {
				if(arr.contains(String.valueOf(s.charAt(i)))) {
					continue;
				}
				for(int j=0;j<=s.length()-1;j++) {
					if(s.charAt(i)==s.charAt(j))
						size++;
				}
				System.out.println(s.charAt(i)+"="+size);
				String s1 =String.valueOf(s.charAt(i));
				arr.add(s1);
				size =0;
				
			}
		}

}

	
