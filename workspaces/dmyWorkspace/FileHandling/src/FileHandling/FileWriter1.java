package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("abc.txt");
		f.write("72");
		f.write("neuron\technology\n");
		char[] ch = {'s','d','e','f','g'};
		f.write(ch);
		f.flush();
		f.close();
		
	}

}
