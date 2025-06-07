
@FunctionalInterface
interface Addition{
	int add(int b);
	
}
public class LaunchAnnotion1 {
public static void main(String[] args) {
	Addition  a =b->b+b;
	System.out.println(a.add(5));
}
}
