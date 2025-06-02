package FileHandling;

import java.io.File;

public class FileHandle6 {
public static void main(String[] args) {
	File f = new File("C:\\Program Files\\Adobe\\Acrobat DC\\Acrobat");
	String []s=f.list();
	int count =0;
	for(String i:s) {
		File f2 =new File(f,i);
		if(f2.isDirectory()) {
		System.out.println(i);
		count++;
		}
		
	}
	System.out.println(count);
}
}
