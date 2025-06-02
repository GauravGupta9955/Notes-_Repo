package Excepions;
class Calculator{
	public void calculate(){
		int c ,a =10;
		
		try {
		c =a/0;	
		}
		catch(Throwable e) {
			System.out.println(" not a valid Input");
		}
		
	}
}


class Calculat extends Calculator{
	public void calculate(){
		int c ,a =10;
		
		try {
		c =a/0;	
		}
		catch(ArithmeticException    e) {
			System.out.println(" not a valid Input");
		}
		
	}
}

public class exception5 {
	public static void main(String[] args) {
		Calculat c = new Calculat();
		c.calculate();	
	}
	

}
