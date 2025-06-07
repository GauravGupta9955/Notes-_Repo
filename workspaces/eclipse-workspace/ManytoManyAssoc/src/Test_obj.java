
public class Test_obj {
	public static void main(String[] args) {
		
		Course c1 = new Course("Injava","java",500);
		Course c2=new Course("InPython","Python",1000);
		Course c3=new Course("InJs","JS",1500);
		
		Course[] course1=new Course[2];
		course1[0]=c1;
		course1[1]=c2;
		

		Course[] course2=new Course[2];
		course2[0]=c1;
		course2[1]=c3;
		
		Course[] course3=new Course[2];
		course3[0]=c1;
		course3[1]=c2;
		
		Student s1=new Student(10,"sachin",49,course1);
		Student s2=new Student(12,"dhoni",49,course2);
		Student s3=new Student(49,"kohli",18,course3);
		
		
		s1.display();
		System.out.println();
		s2.display();
		System.out.println();
		s3.display();
	}

}
