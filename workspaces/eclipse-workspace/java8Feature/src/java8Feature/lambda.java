 package java8Feature;
 
@FunctionalInterface
interface name{
	int show(String a);
}

public class lambda {
public static void main(String[] args) {
	name n = a-> a.length();
	System.out.println(n.show("gaurav")); 
}
}
