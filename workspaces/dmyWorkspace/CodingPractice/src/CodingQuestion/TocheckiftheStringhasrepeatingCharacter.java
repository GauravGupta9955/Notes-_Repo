package CodingQuestion;
//String=aabbsddefffcc"
//output=aa,bb,dd,fff,cc
public class TocheckiftheStringhasrepeatingCharacter {
	public static void main(String[] args) {
		String input="aabbsddefffcc";
		StringBuilder str = new StringBuilder();
		int right=0;
		int left=0;
			while(right<input.length()) {
				if(input.charAt(left)==input.charAt(right)) 
					right++;
				else {
					if(right-left>1) {//left+1!=right
					str.append(input.substring(left, right)).append(",");
					}
					left=right;
				}	
		}
		
		System.out.println(str.toString());
	}

}
