
public class Test_obj {
	public static void main(String[] args) {
		
		Branch branch=new Branch();
		branch.setBid(18);
		branch.setbLoc("Delhi");
		Student stud1 =new Student(10,"Gaurav",25,branch);
		Student stud2 =new Student(11,"Gautam",18,branch);
		Student stud3 =new Student(13,"puja",25,branch);
		
		stud1.display();
		System.out.println();
		stud2.display();
		System.out.println();
		stud3.display();
		System.out.println();
	}

}
