package CodingQuestion;
//To get the output AaBbCcDdEeFf from the input "ABCDEF" and "abcdef" 
public class togettheoutputfromTheInput {
	public static void main(String[] args) {
		String str ="ABCDEF";
		String str1 ="abcdef";
		StringBuilder mixed =new StringBuilder();
		int length = Math.max(str.length(), str1.length());
		for(int i=0;i<length;i++) {
			if(i<str.length())
				mixed.append(str.charAt(i));
			if(i<str1.length())
				mixed.append(str1.charAt(i));		
		}
		
		System.out.println("String is "+mixed.toString());
	}

}
