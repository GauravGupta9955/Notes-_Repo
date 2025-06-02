
public class Stringreverse {
public static void main(String[] args) {
	String revString ="gauravkumargupta";
	String str ="";
	
	int length =revString.length()-1;
	
	for(int i=length; i>0;i--) {
		str =str+revString.charAt(i);
	}
	
	System.out.println(str);
	
}
}
