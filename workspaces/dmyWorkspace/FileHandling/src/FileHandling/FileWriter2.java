package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter2 {
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("abc.txt");
		f.write("72");
		f.write("neuron\technology\n");
		char[] ch = {'s','d','e','f','g','h','i'};
		f.write(ch);
		f.flush();
		f.close();
		
	}

}
