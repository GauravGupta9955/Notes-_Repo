package Excepions;

class demo{
	int disp() {
		try {
			System.out.println("disp");
			return 10;
		}
		finally {
			System.out.println("Display Last Line");
		}
		
		
	}
}

public class Exception10 {
public static void main(String[] args) {
	demo d = new demo();
	 d.disp();
}
}
