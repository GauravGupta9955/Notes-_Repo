interface telusko{
	void display();
	static void show()
	{
		System.out.println(" I am metod of interface");
	}
	private void shock() {
		System.out.println("in a shock");
		
	}
}
public class interface2 {
 public static void main(String[] args) {
	telusko.show();
}
}
