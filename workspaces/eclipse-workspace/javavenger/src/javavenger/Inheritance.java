package javavenger;
class Calculator {
	public int sub(int n, int y) {
		return n-y;
	}
	
	public int add(int n, int y) {
		return n+y;
	}
}

class AdvCalcultor extends Calculator{
	public int multi(int n, int y) {
		return n*y;
	}
	public int div(int n, int y) {
		return n/y;
	}
}
class VeryAdvCalcultor extends AdvCalcultor{
	public double pow(int m , int n) {
		return Math.pow(5, 2);
	}
}

public class Inheritance {
	public static void main(String[] args) {
		VeryAdvCalcultor obj =new VeryAdvCalcultor();
		int mul=obj.multi(5, 3);
		int add=obj.add(5, 3);
		int sub=obj.sub(5, 3);
		int div=obj.div(6, 3);
		int pow =(int)(obj.pow(5,2));
		
		System.out.println(mul+":"+add+":"+sub+":"+div+":"+pow);
		
	}

}
