package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1{
	String name;
	String department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", department=" + department + "]";
	}
	public Employee1(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	
	
	
}

public class GrouptheEmployeebygroupbyusingGroupby {
	public static void main(String[] args) {
		List<Employee1> employees = new ArrayList<>(); 
		employees.add(new Employee1("ALice","HR"));
		employees.add(new Employee1("bob","Engineering"));
		employees.add(new Employee1("Charlie","HR"));
		employees.add(new Employee1("David","Engineering"));
		employees.add(new Employee1("Eve","HR"));
		employees.add(new Employee1("Rahul","Engineering"));
		
		
Map<String,List<Employee1>> map=employees.stream().collect(Collectors.groupingBy(Employee1::getDepartment));
 map.entrySet().forEach(a->System.out.println(a.getKey()+":"+a.getValue()));

}
}
