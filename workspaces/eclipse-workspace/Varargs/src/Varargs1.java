
public class Varargs1 {
public static void main(String[] args) {
	
	Calculation cal = new Calculation();
	int result =cal.add(4,5,6,7,8);
	System.out.println(result);
}
}

class Calculation{
	public int add(int ...num) {
		int sum=0;
		for(int i :num) {
			sum+=i;
		}
		return sum;
		
	}
}