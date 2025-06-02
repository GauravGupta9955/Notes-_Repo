
public class TestObject {

	public static void main(String[] args) {
		Account account= new Account("ISB-1111","saving","sachin");
		Employee employee = new Employee(19979, "Gaurav","Mumbai", account);
		
		employee.display();
	
	
	}

}
