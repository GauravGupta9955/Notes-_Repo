package mainQUestion;

//Input="aabbccaazzaaghaa"Add commentMore actions
//pattern -"aa"
//number--4

public class TogetoutputfromInput {
	public static void main(String[] args) {
		String input="aabbccaazzaaghaa";
		int count=0;
		for(int i=0;i<input.length();i++) {
			if ((i+2)<input.length() && input.substring(i,i+2).equals("aa"))
				count++;
		}
		
		System.out.println("no.of aa is "+count);
	}

}