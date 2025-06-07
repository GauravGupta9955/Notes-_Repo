package clone12;

public class clone1 implements Cloneable {
	
	int i=10;
	int j= 20;
	public static void main(String[] args) throws CloneNotSupportedException {
		clone1 t1 =new clone1();
		clone1 t2 = (clone1)t1.clone();
		t2.i=100;
		t2.j=200;
		System.out.println(t2.i+"==>"+t2.j);
		System.out.println(t1.i+"==>"+t1.j);
		
		
	}



}
