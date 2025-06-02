package in.back.project;

import java.io.IOException;
import java.util.Scanner;

public class AutomatedTrailerMachine {
	private int acc_no=123456;
	private String password="Gaurav45";
	private int inp_acc_no;
	private String inp_password;
	
	public void input() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the account no");
	inp_acc_no=sc.nextInt();
	System.out.println("Enter the paswword");
	inp_password=sc.next();
			;
	}
	
	public void verify() throws InvalidUserException, IOException {
		if(password.equals(inp_password) && acc_no==inp_acc_no) {
			System.out.println("credential verified");
			
			new TransactionImplementaion().insert();
		}
		
		else {
			throw new InvalidUserException("Invalid user ,Please try again");
		}
	}

}
