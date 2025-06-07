package javavenger;
class calculat{
	public int add(int num1,int num2) {
		return num1+num2;
		
	}
	public int add(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
}

public class method_overloading {
	public static void main(String[] args) {
		calculat cal =new calculat();
		int result =cal.add(5, 6);
		System.out.println(result);
		int res=cal.add(5, 7, 9);
		System.out.println(res);
	}

}
