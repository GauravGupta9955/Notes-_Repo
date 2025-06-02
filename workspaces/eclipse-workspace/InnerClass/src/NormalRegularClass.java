
public class NormalRegularClass {
	class Inner{
		 public void m1() {
			 System.out.println("In inner class");
		 }
	}
	public static void main(String[] args) {
		System.out.println("Outer Class");
		//NormalRegularClass Normal = new NormalRegularClass();
		//NormalRegularClass.Inner n1 = 
				new NormalRegularClass().new Inner().m1 ();
		//n1.m1();
	}

}
