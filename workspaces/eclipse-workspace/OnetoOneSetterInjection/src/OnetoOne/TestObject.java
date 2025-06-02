package OnetoOne;

public class TestObject {

	public static void main(String[] args) {
		Account account= new Account();
		account.setAccName("Gaurav");;
		account.setAccNo("19987");
		account.setAccType("saving");
		Employee employee = new Employee();
		
		
		
		employee.setEaddress("Newyork");
		employee.setEid(123456);
		employee.seteName("Gupta");
		employee.setAccount(account);
		
		employee.display();
	
	
	}

}