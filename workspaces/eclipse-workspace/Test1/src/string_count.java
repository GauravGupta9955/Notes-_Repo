import java.util.Map;

import javax.xml.crypto.Data;

import java.util.*;

public class string_count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine().replaceAll("//s", "").toLowerCase();
		int length =str.length()-1;
		Map<Character,Integer> freqmap = new HashMap<>();
		for(int i=0;i<=length;i++) {
			if(freqmap.containsKey(str.charAt(i))) {
				freqmap.put(str.charAt(i), freqmap.get(str.charAt(i))+1);
			}
			else {
				freqmap.put(str.charAt(i),1);
			}
		}
		Set s =freqmap.entrySet();
		Iterator i =s.iterator();
		while(i.hasNext()) {
			Map.Entry data =(Map.Entry)i.next();
			System.out.print(data.getKey()+ ""+data.getValue());
		}
	}

}
