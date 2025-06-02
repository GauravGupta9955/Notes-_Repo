package StreamApi;

import java.util.stream.Collectors;

//Java program to gives two Output: “Subburaj”, “123” 
//for the Input String Str = “Subbu123raj”
public class ProgramtoGiveoutputfromInputjava {
	public static void main(String[] args) {
		String str ="Subbu123raj";
		
		String digit= str.chars().filter(Character::isDigit).
				mapToObj(a->String.valueOf((char)a)).collect(Collectors.joining());
		
		String string=str.chars().filter(Character::isLetter).
				mapToObj(a->String.valueOf((char)a)).collect(Collectors.joining());
		
		System.out.println(digit.toString());
		System.out.println(string.toString());
	}

}
