package mainQUestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee123{
	
	String name;
	int salary;
	public Employee123(String name, int salary) {
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
	@Override
	public String toString() {
		return "Employee123 [name=" + name + ", salary=" + salary + "]";
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
public class SorttheEmployeeaccordingToSalary {
	public static void main(String[] args) {
	ArrayList<Employee123> arr = new ArrayList<Employee123>();
	arr.add(new Employee123("Gaurav",250000));
	arr.add(new Employee123("Gautam",350000));
	arr.add(new Employee123("Rahul",55000));
	arr.add(new Employee123("Raman",50000));
	arr.add(new Employee123("Raju",250000));
	
	Comparator<Employee123> com= (a1,b1)->a1.salary-b1.salary;
	Collections.sort(arr,com);
	
	for(Employee123 emp:arr){
		System.out.println(emp);
	}
}
}
