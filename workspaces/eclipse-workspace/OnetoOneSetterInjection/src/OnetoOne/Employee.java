package OnetoOne;

public class Employee {
	
	private Integer eid;
	private String eName;
	private String eaddress;

	//HAS-A-VARIABLE
	private Account account;
	
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
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
