sealed class Y permits E,F{
	 public void printName()
	   {
	       System.out.println("Default");
	   }
}
non-sealed class E extends Y{
	
}
non-sealed class F extends Y{
	
}
class J{
	
}
public class sealClass {
public static void main(String[] args) {
	
}
}
