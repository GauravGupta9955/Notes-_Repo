package mainQUestion;

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
