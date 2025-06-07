package codingquestion;

class Singleton1{
	private static Singleton1 s;
	private Singleton1() {
		
	}
	
	public static Singleton1 getSingleTon() {
		if(s==null) {
			s= new Singleton1();
			return s;
		}
		else 
			return s;
		
	}

}
public class Singleton {
	public static void main(String[] args) {
		Singleton1 s1 =Singleton1.getSingleTon();
		Singleton1 s2 =Singleton1.getSingleTon();
		System.out.println(s1==s2);
	}
}

