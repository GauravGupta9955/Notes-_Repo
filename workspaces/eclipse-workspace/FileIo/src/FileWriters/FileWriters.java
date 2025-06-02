package FileWriters;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriters {
public static void main(String[] args) throws IOException {
	FileWriter fs = new FileWriter("info.txt");
	fs.write("73\n");
	fs.write("neuron\ntechnology\n");
	char [] ch = {'a','b','c','d'};
	fs.write(ch);
	
	fs.flush();
	fs.close();
	
	FileReader fr = new FileReader("info txt");
	int a =fr.read();
	System.out.println(a);
}
	
	
}

