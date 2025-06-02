
public class Student {
 private Integer sId;
 private String sName;
 private Integer sAge;

 
 //HAS-A VARIABLE
 private Course[] courses;
 
 
 
public Student(Integer sId, String sName, Integer sAge, Course[] courses) {
	this.sId = sId;
	this.sName = sName;
	this.sAge = sAge;
	this.courses = courses;
}

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
public void display() {
	System.out.println("*****Student detail*****");
	System.out.println("Student id ::"+sId);
	System.out.println("Student name is::"+sName);
	System.out.println("Student age is ::"+sAge);
	System.out.println("*****Course Details*****");
	for(Course course:courses) {
		System.out.println("Course Name::"+course.getCname());
		System.out.println("CID is:;"+ course.getCid());
		System.out.println("Costis:;"+ course.getCost());
	}
	
	
}
public Course[] getCourses() {
	return courses;
}
public void setCourses(Course[] courses) {
	this.courses = courses;
}

}
