
 class Akash {
	
	public int add(int num1, int num2) {
		int num3=num1+num2;
		return num3;
	}

}
 class Pawan extends Akash{
	public int sub(int num1, int num2) {
		int num3=num1-num2;
		return num3;
	}

}
public class Inheritance {

	
	 public static void main(String [] args) {
		 
		 MaheshCalc obj1 =new MaheshCalc();
		 int result =obj1.add(5,6);
		 int result2 =obj1.sub(10, 12);
		 int result3 =obj1.multi(5,6);
		 System.out.println(result);
		 System.out.println(result2);
		 System.out.println(result3);
		 
	 }

}
