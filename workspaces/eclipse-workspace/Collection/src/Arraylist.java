import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList al1 =new ArrayList();
		al1.add("ineuron");
		al1.add("B");
		al1.add(4);
		al1.add(25.5);
		System.out.println(al1);
		
		ArrayList al2 =new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(50);
		System.out.println(al2);
		al2.addAll(al1);
		System.out.println(al2); 
		System.out.println(al2.getClass()) ;
	}
}
