class Demo{
	private static Demo d =null;
	private Demo() {
		
	}
	
	public static Demo getDemo() {
		  if (d==null) {
			  d=new Demo();
			  return d;
		  }
		  else
			  return d;
		
	}
}
public class single1 {
 public static void main(String[] args) {
	Demo d1 = Demo.getDemo();
	Demo d2 = Demo.getDemo();
	System.out.println(d1==d2);
	System.out.println(d1.hashCode());
	System.out.println(d2.hashCode());
}
}
