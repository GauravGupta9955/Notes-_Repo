import java.util.Scanner;

class Exceptionalion extends Throwable{

	public Exceptionalion(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}
	
}
class ATM{
	private int accountName =1111;
	private int accountpass =2222;
	private int accn;
	private int pass;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Accont number");
		accn=sc.nextInt();
		System.out.println("Enter password");
		pass =sc.nextInt();
	}
	
	public void verify() throws Exceptionalion {
		if(pass==accountpass || accountName==accn) {
			System.out.println("Correct password");
		}
		else {
			throw new Exceptionalion("Invalid User");
		}
	}
	
}

class Bank{
	public void initiate()throws Exceptionalion {
		ATM atm = new ATM();
		try {
			atm.input();
			atm.verify();
		} catch (Exceptionalion e) {
			System.out.println(e.getMessage());
			try {
				atm.input();
				atm.verify();
			}
			catch (Exceptionalion ex) {
				System.out.println("maximum Attemp Contact to your bank");
			}
			}
			
		}
	}


public class customException1 {
public static void main(String[] args) throws Exceptionalion {
Bank b = new Bank();
b.initiate();
	
}
}
