import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class pRINTwRITER5 {
public static void main(String[] args) throws IOException {
	FileWriter fs = new FileWriter("criket.txt");
	PrintWriter out =new PrintWriter(fs);
	
	out.println(10);
	out.println("sachin");
	out.println(true);
	out.println('M');
	out.println(53.5);
	
	out.flush();
	out.close();
}
}
