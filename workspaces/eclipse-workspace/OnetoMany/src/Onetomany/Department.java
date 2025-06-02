package Onetomany;


public class Department {
	private Integer deptNo;
	private String deptName;
	private String deptLoc;
	private Employees []employees;
	
	public Employees[] getEmployees() {
		return employees;
	}
	public void setEmployees(Employees[] employees) {
		this.employees = employees;
	}
	private Department department;
	public String getDeptLoc() {
		return deptLoc;
	}
	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
   
	
	public void display() {
		System.out.println("******Department Details******");
		System.out.println("Department Location ::"+department.getDeptLoc());
		System.out.println("Department Name::"+department.getDeptName());
		System.out.println("Department Number::"+department.getDeptNo());
		System.out.println("*********Employee detail*******");
		for(Employees emp:employees) {
			System.out.println("Employee id::"+emp.getEid());
			System.out.println("Employee Name:: "+emp.getEname());
		}
		
	}
	
}
