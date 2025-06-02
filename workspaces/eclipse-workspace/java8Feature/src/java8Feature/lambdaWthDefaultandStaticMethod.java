package java8Feature;

@FunctionalInterface
interface Interf{
	void show();
	default void m2(int a) {
		System.out.println(a*a);
	}
	public static void m3(String a) {
		System.out.println(a.length());
	}
}

public class lambdaWthDefaultandStaticMethod {
public static void main(String[] args) {
	Interf maind= ()->System.out.println("gaurav Gupta");
	maind.show();
	maind.m2(5);
	Interf.m3("gaurav");
	
}
}
