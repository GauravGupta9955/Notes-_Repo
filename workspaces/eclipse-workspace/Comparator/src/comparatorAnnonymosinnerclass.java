import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Studentss {
	int age;
	String name;
	String Tech;

	public Studentss(String name, int age, String Tech) {
		this.age = age;
		this.name = name;
		this.Tech = Tech;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", Tech=" + Tech + "]";
	}

}

public class comparatorAnnonymosinnerclass {
	public static void main(String[] args) {
		ArrayList<Studentss> nums = new ArrayList<Studentss>();
		nums.add(new Studentss("gaurav", 27, "js"));
		nums.add(new Studentss("Gautam", 19, "java"));
		nums.add(new Studentss("puja", 31, "python"));

		/*
		 * Comparator<Students> com = new sortbyAge() { public int compare(Students a,
		 * Students b) {
		 * 
		 * return a.age - b.age; } }; //convert it into function Interface
		 * Comparator<Students> com1 =(a, b) -> a.age - b.age; //directly pass it to
		 * argument of collection.sort
		 */		
		
		Collections.sort(nums, (a, b) ->  a.age - b.age);

		for (Studentss n : nums)
			System.out.println(n);
	}
}
