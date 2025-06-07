import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferEiter {
public static void main(String[] args) throws IOException {
	BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
	bw.write("78");
	bw.write("neuron");
	bw.newLine();
	bw.write("technology");
	bw.newLine();
	char ch[]= {'a','b','c','d'};
	bw.write(ch);
	bw.flush();
	bw.close();
}
}
