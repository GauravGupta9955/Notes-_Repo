package Excepions;
class Demo10{
	void disp(){
		System.out.println("parent class overriden method");
		
	}
}
class Demo12 extends Demo10{
	void disp() {
		try {
		System.out.println("overriding in child class");
		}
		catch(Exception e) {
			System.out.println("error");
		}
		
	}
}

public class Exception1 {
	public static void main(String[] args) {
		Demo12 de = new Demo12();
		de.disp(); 
		
	}
	
	

}
