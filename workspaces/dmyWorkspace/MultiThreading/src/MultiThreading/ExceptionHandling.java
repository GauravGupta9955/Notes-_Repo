package MultiThreading;

import java.util.Scanner;

class unwantedExceptionHandling extends Throwable{
	unwantedExceptionHandling(String stg){
		super(stg);
		
	}
}

class ATM {
	private int account =12345;
	private String psw="Gaurav45";
	private int accountInp;
	private String pswinp;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number");
		accountInp=sc.nextInt();
		System.out.println("Enter the password");
		pswinp= sc.next();
		
	}
	
	public void verify() throws unwantedExceptionHandling {
		if(account==accountInp && psw.equalsIgnoreCase(pswinp)) {
			System.out.println("Account verified");
		}
		else {
			throw new unwantedExceptionHandling("Account unverified,try again");
		}
	}
}

class banking{
	public void initialize() {
		ATM a1 = new ATM();
		a1.input();
		try {
			a1.verify();
		}
		catch(unwantedExceptionHandling ex) {
		System.out.println(ex.getMessage());
			a1.input();
			try {
				a1.verify();
			}
			catch(unwantedExceptionHandling eg) {
				a1.input();
				try {
					a1.verify();
				}
				catch(unwantedExceptionHandling ef) {
					System.out.println("invalid accout detail account blocked");
					
				}
			}
			}
			
		}
	}

public class ExceptionHandling {
	public static void main(String[] args) {
		banking b1 = new banking();
		b1.initialize();
	}

}
