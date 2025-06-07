import java.io.File;

//wap to display only filenames

public class fileNameOnly {
public static void main(String[] args) {
	File f=new File("C:\\Users\\gauta\\eclipse-workspace");
	String []r=f.list(); 
	int count =0;
	for(String i:r) {
		File f1=new File(f,i);
		if(f1.isFile()) {
		System.out.println(i);
		count++;
		}
	}
	
	System.out.println("No. of files "+count);
}
}
