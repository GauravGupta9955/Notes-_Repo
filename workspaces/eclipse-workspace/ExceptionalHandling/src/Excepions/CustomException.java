package Excepions;

import java.util.*;


class InvalidUserException extends Throwable{

	public InvalidUserException(String string) {
		super(string); 
	}
	
}

class ATM{
	private int accountNum=1111;
	private int password =2222;
	private int accN;
	private int pw;
	public void input() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the account Number");
		accN =scan.nextInt();
		System.out.println("Enter the Password");
		pw=scan.nextInt();
	}
	
	public void verify() throws InvalidUserException {
		if(accountNum ==accN && password==pw) {
			System.out.println("Collect your cash");
		}
		else {
			/*
			 * InvalidUserException iue = new InvalidUserException();
			 * System.out.println("Invalid Credentials"); throw iue;
			 */ 
			
			throw new InvalidUserException("Invalid user!!! this is your account");
		}
	}
}
class Bank{
	public void initiate() throws InvalidUserException {
		
		ATM a = new ATM();
		try {
			
			a.input();
			a.verify();	
		}
		catch(InvalidUserException e) {
			try {
				System.out.println(e.getMessage());
				a.input();
				a.verify();
			}
			catch(InvalidUserException f) {
				try {
					System.out.println(e.getMessage());
					a.input();
					a.verify();
				}
				catch(InvalidUserException g) {
					try {
						System.out.println(e.getMessage());
						a.input();
						a.verify();
					}
					catch(InvalidUserException h) {
						System.out.println("your card is blocked");
						System.exit(0);
					}
				}
			}
		}
	}
}
public class CustomException {
public static void main(String[] args) throws InvalidUserException {
	Bank b = new Bank();
	b.initiate();
}
}
