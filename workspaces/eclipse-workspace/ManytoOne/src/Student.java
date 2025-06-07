
public class Student {
 private Integer sId;
 private String sName;
 private Integer sAge;
 
 private Branch branch;
 private Student student;
 
public Integer getsId() {
	return sId;
}
public void setsId(Integer sId) {
	this.sId = sId;
}

public Integer getsAge() {
	return sAge;
}
public void setsAge(Integer sAge) {
	this.sAge = sAge;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public Branch getBranch() {
	return branch;
}
public void setBranch(Branch branch) {
	this.branch = branch;
}
public Student(Integer sId, String sName, Integer sAge, Branch branch) {
	this.sId = sId;
	this.sName = sName;
	this.sAge = sAge;
	this.branch = branch;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}

public void display() {
	System.out.println("*****Student detail*****");
	System.out.println("Student id ::"+student.getsId());
	System.out.println("Student name is::"+student.getsName());
	System.out.println("Student age is ::"+student.getsAge());
	System.out.println("*****Branch Details*****");
	System.out.println("Branch id is ::"+branch.getBid());
	System.out.println("Branch location is::"+branch.getbLoc());
	
}

}
