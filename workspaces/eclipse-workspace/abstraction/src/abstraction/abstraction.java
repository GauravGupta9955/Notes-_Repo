package abstraction;

abstract class Calculator{
	abstract public int add();
	abstract public int add(int a ,int b);
	
}

abstract class cal extends Calculator{

	@Override
	public int add() {
		int a =10;
		int b =30;
		int c=a+b;
		return c;
	}
}

class cal1 extends cal{
	public int add(int a ,int b) {
		int c=a+b;
		return c;
	}
}

public class abstraction {
	public static void main(String[] args) {
		 cal1 abc =new cal1();
		 System.out.println(abc.add());
		 System.out.println(abc.add(5, 6));
	}

}
