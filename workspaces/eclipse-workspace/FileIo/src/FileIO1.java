  import java.io.File;
import java.io.IOException;

public class FileIO1 {
public static void main(String[] args) throws IOException {
	File f = new File("abc.txt");
	System.out.println(f.exists());
	f.createNewFile();
	System.out.println(f.exists());
}
}
