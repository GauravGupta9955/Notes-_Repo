package javavenger;
class Student{
	int marks;
	String name;
	int rollno;
}

public class ArrayOops_concept {
	public static void main(String[] args) {
		Student s1 =new Student();
		s1.marks=15;
		s1.name="naveen";
		s1.rollno=15;
		Student s2 =new Student();
		s2.marks=16;
		s2.name="praveen";
		s2.rollno=17;
		Student s3 =new Student();
		s3.marks=18;
		s3.name="raveen";
		s3.rollno=19;
		
		Student Stu[]=new Student[3];
		Stu[0]=s1;
		Stu[1]=s2;
		Stu[2]=s3;
		for (Student n:Stu) {
			System.out.println(n.name+":"+n.marks);
			
		}
		
		
		
		
	}
	

}
