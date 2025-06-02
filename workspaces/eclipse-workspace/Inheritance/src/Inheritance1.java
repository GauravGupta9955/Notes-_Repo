class A{
	int i =5;
	public void show() {
		System.out.println("In a Show");
	}
}
class B extends A
{
	int i =7;
	public void printIValue() {
		int i=9;
		System.out.println(i);//represents local Variable
		System.out.println(this.i);//represents current Variable
		System.out.println(super.i);//represents super variable
		 
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		B obj =new B();
		obj.show();
		obj.printIValue();
		
	}
}
