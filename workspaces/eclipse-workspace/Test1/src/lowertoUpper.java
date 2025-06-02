
public class lowertoUpper {
	public static void main(String[] args) {
		String s1 = "GauravkumarGupta";
		String s2 = "";

		int length = s1.length() - 1;

		for (int i = 0; i <=length; i++) {
			if ((int) (s1.charAt(i) - 32)!= 0) {
				if ((s1.charAt(i)) <'a') {
					s2 = s2 + s1.charAt(i);
					
				} else {
					s2 = s2 + (char)(s1.charAt(i) -32);
					
				}
			} else {
				s2 =s2+" ";
			}
		}

		System.out.println(s2);

	}

}
