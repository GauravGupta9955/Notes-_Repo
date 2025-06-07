package codingquestion;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	int age;
	String name;
	String Tech;
	public Student(String name, int age, String Tech) {
		this.age =age;
		this.name=name;
		this.Tech =Tech;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", Tech=" + Tech + "]";
	}

	@Override
	public int compareTo(Student that) {
		// TODO Auto-generated method stub
		return this.age-that.age;
	}
	
}

public class comparable1 {
	public static void main(String[] args) {
		ArrayList<Student> nums = new ArrayList<Student>();
		nums.add(new Student("gaurav",27,"js"));
		nums.add(new Student("Gautam",19,"java"));
		nums.add(new Student("puja",31,"python"));
		
		Collections.sort(nums);
		for(Student n:nums)
			System.out.println(n);
	}

}
