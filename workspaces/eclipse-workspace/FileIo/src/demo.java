import java.io.File;
import java.io.IOException;

// write a code to crate a file named with demo.txt in current working 
//directory.
public class demo {
public static void main(String[] args) throws IOException {
	File f =new File("demo.txt");
	f.createNewFile();
	System.out.println(f.exists());
}
}
