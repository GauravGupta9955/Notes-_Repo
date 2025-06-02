package StreamApi;

import java.util.ArrayList;
import java.util.List;

class Employee{
	
	String name;
	int salary;
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}

public class stu {
	
	public static void main(String[] args) {
		
		List<Employee> arr = new ArrayList<>();
		arr.add(new Employee("gaurav",59000));
		arr.add(new Employee("gautam",48000));
		arr.add(new Employee("Rahul",90000));
		arr.add(new Employee("Raman",40000));
		
		arr.stream().filter(a->(a.getName().startsWith("g") && a.getSalary()>50000))
		.forEach(a->System.out.println(a.getName()+"::"+a.getSalary()));
	}

}
