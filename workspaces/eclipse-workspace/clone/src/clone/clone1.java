package clone;

public class clone1 {


	int i=10;
	int j= 20;
	public static void main(String[] args) throws Exception {
		clone1 t1 =new clone1();
		clone1 t2 = (clone1)t1.clone();
		
		System.out.println(t2.i+"==>"+t2.j);
		
		
	}


}

