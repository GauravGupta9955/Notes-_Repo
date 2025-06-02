package FileHandling;

import java.io.File;
import java.io.IOException;

public class Filemkdir {
	public static void main(String[] args) throws IOException {
		File f =new File("cricket123");
		System.out.println(f.exists());
		f.mkdir();
		File f2 =new File(f,"demo.txt");
		f2.createNewFile();
	}

}
