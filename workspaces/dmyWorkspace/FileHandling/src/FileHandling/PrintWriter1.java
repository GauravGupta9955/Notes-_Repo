package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

//
public class PrintWriter1 {
public static void main(String[] args) throws IOException {
	PrintWriter pw = new PrintWriter("xyz.txt");
	BufferedReader bw = new BufferedReader(new FileReader("abc.txt"));
	String line = bw.readLine();
	while(line !=null) {
		pw.println(line);;
		line=bw.readLine();
	}
	BufferedReader bw1 = new BufferedReader(new FileReader("bcd.txt"));
	String line1 = bw1.readLine();
	while(line1 !=null) {
		pw.println(line1);;
		line1=bw1.readLine();
	}
	
	pw.close();
	pw.flush();
	
	
}
}
