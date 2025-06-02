package in.back.project;

import java.io.IOException;

public class BankApp {
	public void initiate() throws InvalidUserException, IOException {
		AutomatedTrailerMachine atm =new AutomatedTrailerMachine();
		try {
		atm.input();
		atm.verify();
		}
		catch(InvalidUserException ex) {
		System.out.println(ex.getMessage());
		try {
			atm.input();
			atm.verify();
			}
			catch(InvalidUserException fx) {
			System.out.println(fx.getMessage());
			try {
				atm.input();
				atm.verify();
				}
				catch(InvalidUserException gx) {
				System.out.println("your account is Blocked");
				}
				
				}
			
			}
		
		}
		
	}

