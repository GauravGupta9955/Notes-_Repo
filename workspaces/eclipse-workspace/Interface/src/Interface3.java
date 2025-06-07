 interface calcu{
	 void add();
 }
 class calcu2 {
	 void sub() {
	 int a =10;
	 int b=20;
	 int  c=a+b;
	 System.out.println(c);
	 }
 }
 class calcu3 extends calcu2 implements calcu{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a =50;
		int b=60;
		System.out.println(a+b);
	}
	 
 }
public class Interface3 {
	public static void main(String[] args) {
		calcu3 cal =new calcu3();
		cal.add();
		cal.sub();
	}
	

}
