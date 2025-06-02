package javaString;

public class String1 {
	public static void main(String[] args) {
		String s1= "Think Twice";
		String s2 ="";
		String s5="";
		String [] s3=s1.split(" ");
		
		for (int i =0;i<=s3.length-1;i++) {
			String s4=s3[i];
			for(int j=s4.length()-1;j>=0;j--) {
				s5=s5+s4.charAt(j);
			}
			s2=s2+s5+ " ";
			s5="";
		}
		
		System.out.println(s2);
		
	}

}
