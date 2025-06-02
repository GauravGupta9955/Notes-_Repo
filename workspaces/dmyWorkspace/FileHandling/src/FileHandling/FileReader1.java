package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("abc.txt");
		char[] ch = new char[100];
		f.read(ch);
		for(char c:ch) 
		System.out.print(c);
		f.close();
	}

}
