import java.util.Enumeration;
import java.util.Vector;

public class enum1 {
public static void main(String[] args) {
	Vector v = new Vector();
	v.add(100);
	v.add(20);
	v.add(10);
	v.add(30);
	v.add(50);
	
	Enumeration e = v.elements();
	
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
}
}
