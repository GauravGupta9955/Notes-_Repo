import java.io.File;
import java.io.IOException;

public class mkdirfile {
public static void main(String[] args) throws IOException {
	File f = new File("tempdir");
	System.out.println(f.exists());//false
	f.mkdir();
	File f3 = new File(f,"temp.txt");
	f3.createNewFile();
	System.out.println(f3.exists());//true
}
}
