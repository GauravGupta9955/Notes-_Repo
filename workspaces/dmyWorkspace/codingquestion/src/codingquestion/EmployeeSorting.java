package codingquestion;

import java.util.ArrayList;
import java.util.List;

class Employee{
	private String name;
	private int salary;
	Employee(String name,int salary){
		this.name =name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}

public class EmployeeSorting {
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Gautam",50000));
		emp.add(new Employee("Saurav",60000));
		emp.add(new Employee("Rahul",750000));
		emp.add(new Employee("Ram",56000));
		emp.add(new Employee("Shivam",56000));
		
	List<Employee> arr=	emp.stream().
				filter(n->(n.getName().startsWith("S") && (n.getSalary()>=50000))).toList();
	arr.forEach(System.out::println);		
		
		
		
		
	}

}
