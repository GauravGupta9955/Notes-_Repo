
public class Employee {
	
	private Integer eid;
	private String eName;
	private String eaddress;

	//HAS-A-VARIABLE
	private Account account;
    //performing constructor injector(alt+shift+s,o)
	public Employee(Integer eid, String eName, String eaddress, Account account) {
		System.out.println("Employee::constructor");
		this.eid = eid;
		this.eName = eName;
		this.eaddress = eaddress;
		this.account = account;
	}
	//code for displaying the data of the object
	public void display() {
		System.out.println("Employee :: display method called");
		System.out.println("**********Employ Details are***********");
		System.out.println("EID is ::" +eid);
		System.out.println("EName is::"+eName);
		System.out.println("eAddress is::"+ eaddress);
		System.out.println("**********Acconts Details are***********");
        System.out.println("Account Name is ::"+account.getAccName());
        System.out.println("Account number is ::"+account.getAccNo());
        System.out.println("Account type is::"+account.getAccType());
        		
	}
	
	
	
	

}
