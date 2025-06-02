 import java.util.*;

public class mAP1 {
public static void main(String[] args) {
	HashMap hm =new HashMap();
	hm.put(10, "sachin");
	hm.put(7, "dhoni");
	hm.put(18, "kohli");
	hm.put(45, "rohit");
	
	Set s = hm.keySet();
	System.out.println(s);
	System.out.println(s.getClass().getName());
	System.out.println();
	
	Collection c = hm.values();
	System.out.println(c);
	System.out.println(c.getClass().getName());
	System.out.println();
	
	Set mapData = hm.entrySet();
	System.out.println(mapData);
	System.out.println(mapData.getClass().getName());
	System.out.println();
	
	Iterator iter =mapData.iterator();
	
	while(iter.hasNext()) {
		System.out.println(iter.next() );
	}
}
}
