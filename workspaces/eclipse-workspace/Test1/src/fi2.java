@FunctionalInterface
interface Dclass{
	int sum(int num1,int num2);
}

public class fi2 {
	public static void main(String[] args) {
		Dclass e =( num1,num2)->num1 + num2;
			
		
		System.out.println(e.sum(5, 6));
	}

}
