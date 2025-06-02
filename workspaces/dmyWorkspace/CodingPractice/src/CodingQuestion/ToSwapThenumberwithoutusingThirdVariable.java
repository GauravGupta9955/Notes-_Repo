package CodingQuestion;
//Java program to swap two numbers without using third variable
public class ToSwapThenumberwithoutusingThirdVariable {
	public static void main(String[] args) {
		int a =10,b=45;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is " +a);
		System.out.println("b is " +b);
	}
	

}
