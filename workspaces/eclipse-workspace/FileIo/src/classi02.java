import java.io.File;
import java.io.IOException;

public class classi02 {
public static void main(String[] args) throws IOException {
	File f = new File("temp");
	f.mkdir();
	File e = new File("temp","abc.txt");
	e.createNewFile();
	File g = new File(f,"abc.txt");
	e.createNewFile();
	
	
}
}
