package StreamApi;



public class test1 {
	public static void main(String[] args) {
		
		String str ="abaababa";
		String current =new String();
		String longest=new String();
		Boolean polidrom=false;
		
		for(int i=0;i<str.length();i++) {
			 current="";
			for(int j=i+1;j<str.length();j++) {
				current=str.substring(i,j);
				polidrom=polindrom(current);
				if(polidrom && current.length()>longest.length())
                     longest=new String(current);
				    
			}
		}
		
		System.out.println("Longest polindrom string "+longest);
	}

	private static boolean polindrom(String str1) {
		// TODO Auto-generated method stub
		int left =0,right=str1.length()-1;
		while(left<str1.length()) {
			if(str1.charAt(left)!=str1.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	

	
	
	

}
