package FileHandlin;

import java.io.File;
import java.lang.*;

public class FileHandlein1 {
	public static void main(String[] args) {
		File f = new File("abc.txt");
		System.out.println(f.exists());
	}

}
