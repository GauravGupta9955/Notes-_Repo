import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	
	int age;
	String name;
	String tech;
	
	

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", tech=" + tech + "]";
	}



	public Student(int age, String name, String tech) {
		super();
		this.age = age;
		this.name = name;
		this.tech = tech;
	}
	
}
public class StudentComp {
	public static void main(String[] args) {
		java.util.ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student(12,"gaurav","Electrical"));
		a1.add(new Student(19,"gautam","chemistry"));
		a1.add(new Student(10,"rahul","mechanical"));
		
		Comparator <Student>com = new Comparator<>() {
			public int compare(Student a,Student b ) {
				return a.age-b.age;
			}
			
		};
		
		Collections.sort(a1,com);
		
		for(Student n:a1) {
			System.out.println(n);
		}
		
	}

}
