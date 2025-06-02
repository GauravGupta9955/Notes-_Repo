import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student123
{
	int age;
	String name;
	String Tech;
	public Student123(String name, int age, String Tech) {
		this.age =age;
		this.name=name;
		this.Tech =Tech;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", Tech=" + Tech + "]";
	}
	
}
class sortbyAge implements Comparator<Student123>
{
	  public int compare(Student123 a, Student123 b)
	    {
	 
	        return a.age - b.age;
	    }
}
public class Comparator2 {
	public static void main(String[] args) {
		ArrayList<Student123> nums = new ArrayList<Student123>();
		nums.add(new Student123("gaurav",27,"js"));
		nums.add(new Student123("Gautam",19,"java"));
		nums.add(new Student123("puja",31,"python"));
		
		Comparator<Student123> com = new sortbyAge();
		Collections.sort(nums, com);
		
		for(Student123 n:nums)
			System.out.println(n);
}
}
