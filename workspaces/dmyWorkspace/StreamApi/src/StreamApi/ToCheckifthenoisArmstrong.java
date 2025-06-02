package StreamApi;

public class ToCheckifthenoisArmstrong {
	public static void main(String[] args) {
		int arm=370;
		
		int size=String.valueOf(arm).length();
		int num1=String.valueOf(arm).chars().map(Character::getNumericValue).
				map(c->(int)Math.pow(c,size)).sum();
		
		if(arm==num1)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");
	}

}
