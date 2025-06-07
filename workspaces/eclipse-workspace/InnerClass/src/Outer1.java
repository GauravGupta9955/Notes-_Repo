
public class Outer1 {
	public class Inner {
		public void show() {
			System.out.println("inside the inner class");
		}
	}

	public void m1() {
		Inner i1 = new Inner();
		i1.show();
	}

	public static void main(String[] args) {
		Outer1 out = new Outer1();
		out.m1();

	}
}
