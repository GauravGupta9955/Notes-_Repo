import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students 
{
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
		return "Student [age=" + age + ", name=" + name + ", Tech=" + Tech + "]";
	}
	
}

public class Comaprator3 {
	public static void main(String[] args) {
		ArrayList<Students> nums = new ArrayList<Students>();
		nums.add(new Students("gaurav",27,"js"));
		nums.add(new Students("Gautam",19,"java"));
		nums.add(new Students("puja",31,"python"));
		
		Collections.sort(nums, (a,b)->a.age-b.age);
		
		for(Students n:nums)
			System.out.println(n);
}
}
