package Onetomany;

import java.util.Scanner;

public class TestObj {
	public static void main(String[] args) {
		Department department =new Department();
		
		Employees emp1 = new Employees(10,"sachin");
		Employees emp2 = new Employees(18,"Kohili");
		Employees emp3 = new Employees(45,"rohit");
		Employees []employees =new Employees[3];
		employees[0]=emp1;
		employees[1]=emp2;
		employees[2]=emp3;
		
		department.setDeptName("Engineering");
		department.setDeptLoc("dubai");
		department.setDeptNo(15);
		department.setDepartment(department);
		department.setEmployees(employees);
		
		
		department.display();	
	}
	

}
