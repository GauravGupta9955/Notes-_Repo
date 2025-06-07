package Excepions;

import java.util.Scanner;

class InvalidAgeException extends Throwable{

	
	 public InvalidAgeException(String string) { 
		 super(string); 
	}

}
class InvalidAgeExceptionUpper extends Throwable{

	
	 public InvalidAgeExceptionUpper(String string) { 
		 super(string); 
	}

}

class RTO{
	int Legalage =18;
	int age;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		age =sc.nextInt();
	}
	public void verifyAge() throws InvalidAgeException, InvalidAgeExceptionUpper {
		if(age>=18 && age<60) {
			System.out.println("License is verified");
		}
		else if(age<18) {
			throw new InvalidAgeException("Age is less than 18");
		}
		else if(age>60) {
			throw new InvalidAgeExceptionUpper("Age is less than 60");
		}
	}
	
}
class RTOVerifier{
	public void licenseVerifier() throws InvalidAgeException, InvalidAgeExceptionUpper {
		RTO v = new RTO();
		try {
			
			v.input();
			v.verifyAge();
		}
		catch(InvalidAgeException e) {
			try {
				v.input();
				v.verifyAge();	
			}
		catch(InvalidAgeException f) {
			System.out.println(f.getMessage());
			System.out.println("Age is below 18 can't provide License");
		    System.exit(0);
		}
		catch(InvalidAgeExceptionUpper g) {
			System.out.println(g.getMessage());
			System.out.println("Age is greater than 60 can't provide License");
		    System.exit(0);
		}
	}
		catch(InvalidAgeExceptionUpper h) {
			try {
				v.input();
				v.verifyAge();	
			}
		catch(InvalidAgeException i) {
			System.out.println(i.getMessage());
			System.out.println("Age is below 18 can't provide License");
		    System.exit(0);
		}
		catch(InvalidAgeExceptionUpper j) {
			System.out.println(j.getMessage());
			System.out.println("Age is greater than 60 can't provide License");
		    System.exit(0);
		}
		}
		
	}
}
public class customExcp2 {
public static void main(String[] args) throws InvalidAgeException, InvalidAgeExceptionUpper {
	RTOVerifier rto =new RTOVerifier();
	rto.licenseVerifier();
}
}
