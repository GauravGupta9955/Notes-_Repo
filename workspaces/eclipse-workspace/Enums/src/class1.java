enum Result{
	PASS,FAIL,NR;
}
public class class1 {
	enum Gender{
		MALE,FEMALE,OTHERS;
	}
	public static void main(String[] args) {
		Result r =Result.PASS;
		System.out.println(r);
		int i =Gender.MALE.ordinal();
		System.out.println(i);
	}
}
