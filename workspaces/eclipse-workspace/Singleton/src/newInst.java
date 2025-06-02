class Student {
	static {
		System.out.println("Student class loading");
	}

	public Student() {
		System.out.println("Student object get crated");
	}
}

public class newInst {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Student std = (Student) (Class.forName(args[0]).newInstance());

	}
}
