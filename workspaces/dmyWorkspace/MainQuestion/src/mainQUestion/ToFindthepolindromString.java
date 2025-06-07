package mainQUestion;

public class ToFindthepolindromString {
	public static void main(String[] args) {
	String str ="abvba";
	boolean bool =polindrom(str);
	if(bool)
	System.out.println("polindron string");
	else {
		System.out.println("not polindron");
	}
	

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
