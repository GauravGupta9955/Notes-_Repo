import java.util.*;

class Employee1234{
	String name;
	int salary;
	public Employee1234(String name, int salary) {
		this.salary=salary;
		this.name=name;
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
}
public class test12{
	public static void main(String[] args) {
		ArrayList<Employee1234> arr = new ArrayList<>();
		arr.add(new Employee1234("gaurav", 70000));
		arr.add(new Employee1234("gautam", 50000));
		arr.add(new Employee1234("sudama", 60000));
		arr.add(new Employee1234("rahul", 60000));
		arr.add(new Employee1234("himanshu", 60000));
		for (Employee1234 emp : arr) {
			if (emp.getName().startsWith("g") && emp.getSalary() > 6000)
				System.out.println(emp.getName() + ":" + emp.getSalary());
		}
	}
	
}
