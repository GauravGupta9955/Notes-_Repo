@FunctionalInterface
interface cis{
int getLength(String s);
}
public class fi {
	public static void main(String[] args) {
		cis c1 = (s) ->s.length();
		int len= c1.getLength("gaurav");
		System.out.println(len);
	}
	

}
