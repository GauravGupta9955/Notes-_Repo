package StreamApi;
//Java program to gives two Output: “Subburaj”, “123” 
//for the Input String Str = “Subbu123raj”

public class WriteaProgramtogetoutputfromstring {
	public static void main(String[] args) {

		String str ="Subbu123raj";
		StringBuilder letter = new StringBuilder();
		StringBuilder digit = new StringBuilder();
	
		str.chars().mapToObj(a->(char)a).filter(a->Character.isLetter(a)).forEach(a->letter.append(a));
		str.chars().mapToObj(a->(char)a).filter(a->Character.isDigit(a)).forEach(a->digit.append(a));
		
		System.out.println(letter);
		System.out.println(digit);
	
	}

}
