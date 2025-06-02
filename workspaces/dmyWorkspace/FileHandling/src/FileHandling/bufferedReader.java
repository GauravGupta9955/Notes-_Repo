package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReader {
	public static void main(String[] args) throws IOException {
		BufferedReader bw = new BufferedReader(new FileReader("abc.txt"));
		String line=bw.readLine();
		while(line!=null) {
			System.out.println(line);
			line =bw.readLine();
		}
		bw.close();
		
	}

}
