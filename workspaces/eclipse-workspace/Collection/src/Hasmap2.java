import java.util.*;

public class Hasmap2 {
public static void main(String[] args) {
	IdentityHashMap h = new IdentityHashMap();
	
	Integer i1 = new Integer(10);
	Integer i2 = new Integer(10);
	h.put(i1, "sachin");
	h.put(i2,"Messi");
	System.out.println(h);
}
}
