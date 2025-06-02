package codingquestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students{
	int age;
	String name;
	String Tech;
	public Students(String name, int age, String Tech) {
		this.age =age;
		this.name=name;
		this.Tech =Tech;
	}
	
	@Override
	public String toString() {
		return "Students[age=" + age + ", name=" + name + ", Tech=" + Tech + "]";
	}

	
	
}


public class Comparator1 {
	private void mains() {
		// TODO Auto-generated method stub
		ArrayList<Students> nums = new ArrayList<Students>();
		nums.add(new Students("gaurav",27,"js"));
		nums.add(new Students("Gautam",19,"java"));
		nums.add(new Students("puja",31,"python"));
		
		Comparator<Students> nums1 = (a,b)->a.age-b.age;
		
		Collections.sort(nums,nums1);
		
		for(Students n:nums)
			System.out.println(n);
		
		
	}

}
