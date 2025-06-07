package functInterface;

interface demo{
	void disp();
}
class Alpha implements demo{
	
	public void disp() {
		System.out.println(" I have given body");
	}
}

public class functInterface {
	public static void main(String[] args) {
		demo d = new Alpha();
		d.disp();
		
	}

}
