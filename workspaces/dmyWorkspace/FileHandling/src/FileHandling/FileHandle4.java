package FileHandling;

import java.io.File;

public class FileHandle4 {
	public static void main(String[] args) {
		File f = new File("C:\\Program Files");
		String []s=f.list();
		int count =0;
		for(String i:s) {
			System.out.println(i);
			count++;
		}
		System.out.println(count);
	}

}
