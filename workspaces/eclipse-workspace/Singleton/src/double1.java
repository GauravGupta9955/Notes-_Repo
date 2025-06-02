class Demo2{
	private static Demo2 d1 = null;
	private static Demo2 d2 =null;
	
	private Demo2() {
		
	}
	public static Demo2 getDemo2() {
		if(d1==null) {
			d1 =new Demo2();
			return d1;
		}
		else if(d2==null) {
			d2 = new Demo2();
			return d2;
		}
		else {
			if(Math.random()<0.5) {
				return d1;
			}
			else {
				return d2;
			}
		}
	}
}
public class double1 {
public static void main(String[] args) {
	System.out.println(Demo2.getDemo2().hashCode());
	System.out.println(Demo2.getDemo2().hashCode());
	System.out.println(Demo2.getDemo2().hashCode());
	System.out.println(Demo2.getDemo2().hashCode());
}
}
