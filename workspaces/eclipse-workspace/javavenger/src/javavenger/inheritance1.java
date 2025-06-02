package javavenger;


class Akash {
	public int add(int num1, int num2) {
		return num1+num2;
	}

}
class Pawan extends Akash{
	public int sub(int num1, int num2) {
		return num1-num2;
	}

}
public class inheritance1 {
	 public static void main(String [] args) {
		 
		 Akash obj1 =new Akash();
		 int result =obj1.add(5,6);
		 System.out.println(result);
		 
	 }

}

