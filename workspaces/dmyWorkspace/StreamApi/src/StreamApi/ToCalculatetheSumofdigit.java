
package StreamApi;

public class ToCalculatetheSumofdigit {
	public static void main(String[] args) {
		
          int a=370;
		
		int size=String.valueOf(a).length();
		int sum =String.valueOf(a).chars().map(Character::getNumericValue).
				map(b->(int)Math.pow(b, size)).sum();
		System.out.println(sum);
	}

}
