import java.io.File;

/*// WAP to display the names of the file present in the 
C:\Users\gauta\eclipse-workspace*/
public class TodispalaynameofThefile {
public static void main(String[] args) {
	File f=new File("C:\\Users\\gauta\\eclipse-workspace");
	String []r=f.list();
	int count =0;
	for(String i:r) {
		System.out.println(i);
		count++;
	}
	
	System.out.println("No. of files "+count);
}
}
