interface Calc1{
	void add(int a ,int b);
}
interface Calc2{
	int sub (int a,int b);
}
class MyCacl implements Calc1,Calc2{

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}
	
}
public class Interface1 {
	
	public static void main(String[] args) {
		MyCacl calc1 = new MyCacl();
		calc1.add(5, 6);
		System.out.println(calc1.sub(8, 2));
	}

}
