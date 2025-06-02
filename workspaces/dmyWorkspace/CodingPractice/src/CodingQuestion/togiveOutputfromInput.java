package CodingQuestion;

/*Java program to gives Output: “32412120000” for the Input String Str = “32400121200”*/
public class togiveOutputfromInput {
	public static void main(String[] args) {
		String str ="32412120000";
		StringBuilder number =new StringBuilder();
		StringBuilder zeroes =new StringBuilder();
		for(char ch:str.toCharArray()) {
			if(ch=='0') {
				zeroes.append(ch);
			}
			else {
				number.append(ch);
			}
		}
		System.out.println(number.toString()+zeroes.toString());
	}

}
