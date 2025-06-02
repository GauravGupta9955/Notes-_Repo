import java.util.*;

public class LINKHAS {
	public static void main(String[] args) {
		LinkedHashMap lhp = new LinkedHashMap();
		lhp.put(10, "sachin");
		lhp.put(12, "gautam");
		lhp.put(13, "rupa");
		lhp.put(15, "rupam");
		
		Set s =lhp.entrySet();
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			Map.Entry data =(Map.Entry) itr.next();
			
			System.out.println(data.getKey()+":"+data.getValue());
		}
	}
}
