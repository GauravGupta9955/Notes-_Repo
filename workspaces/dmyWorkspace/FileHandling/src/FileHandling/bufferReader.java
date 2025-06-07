package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferReader {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
		bw.write(73);
		bw.write("ineuron");
		bw.newLine();
		bw.write("technology");
		bw.newLine();
		char ch[]= {'a','b','c','d','e'};
		bw.write(ch);
		bw.flush();
		bw.close();
	}

}
