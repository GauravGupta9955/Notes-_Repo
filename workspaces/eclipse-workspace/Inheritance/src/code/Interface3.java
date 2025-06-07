package code;
@FunctionalInterface
interface CLS{
	int getLength(String s);
}

public class Interface3 {
	public static void main(String[] args) {
		CLS c =new CLS() {

			@Override
			public int getLength(String s) {
				int length = s.length();
				return length;
			}
			
		};
		int len =c.getLength("gaurav");
		System.out.println("length of the String "+len);
	}

}
